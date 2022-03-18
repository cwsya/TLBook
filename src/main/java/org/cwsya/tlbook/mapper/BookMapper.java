package org.cwsya.tlbook.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cwsya.tlbook.domain.DO.BookDO;

/**
 * @author cws
 */
@Mapper
public interface BookMapper extends BaseMapper<BookDO> {

}
