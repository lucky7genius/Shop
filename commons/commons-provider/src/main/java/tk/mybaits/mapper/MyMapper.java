package tk.mybaits.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 描述:
 * 创建时间: 2019-09-05 14:49
 *
 * @author 姓名 lucky7genius  E-mail:xup@nmzh.com.cn
 * @version V1.0.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
