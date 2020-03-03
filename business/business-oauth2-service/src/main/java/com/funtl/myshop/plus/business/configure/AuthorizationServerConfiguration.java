package com.funtl.myshop.plus.business.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;

/**
 * 描述: 配置认证服务器.
 * 创建时间: 2019-09-11 8:43
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    /**
     * 注入用于支持 password 模式
     */
    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 第一处修改，注入 RedisConnectionFactory，用于连接 Redis
     */
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        // 配置数据源（注意，我使用的是 HikariCP 连接池），以上注解是指定数据源，否则会有冲突
        return DataSourceBuilder.create().build();
    }

    @Bean
    public TokenStore tokenStore() {
        // 第二处修改，将 JdbcTokenStore 修改为 RedisTokenStore
        return new RedisTokenStore(redisConnectionFactory);
        // 基于 JDBC 实现，令牌保存到数据库
        // return new JdbcTokenStore(dataSource());
    }

    @Bean
    public ClientDetailsService jdbcClientDetailsService() {
        // 基于 JDBC 实现，需要事先在数据库配置客户端信息
        return new JdbcClientDetailsService(dataSource());
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                // 用于支持密码模式
                .authenticationManager(authenticationManager)
                .tokenStore(tokenStore());
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
//         允许客户端访问 /oauth/check_token 检查 token
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }

    /**
     * 配置客户端
     *
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 客户端配置
        clients.withClientDetails(jdbcClientDetailsService());
        // 使用内存设置
//               clients.inMemory()
        //client_id
//                .withClient("client")
        // client_secret
//                .secret(passwordEncoder.encode("secret"))
        // 授权类型，密码模式和刷新令牌
//                .authorizedGrantTypes("password", "refresh_token")
        // 授权范围
//                .scopes("backend")
        // 可以设置对哪些资源有访问权限，不设置则全部资源都可以访问
//                .resourceIds("backend-resources")
        // 设置访问令牌的有效期，这里是 1 天
//                .accessTokenValiditySeconds(60 * 60 * 24)
        // 设置刷新令牌的有效期，这里是 30 天
//                .refreshTokenValiditySeconds(60 * 60 * 24 * 30);
    }
}
