package org.cwsya.tlbook.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.cwsya.tlbook.domain.DO.BookAndClassDO;
import org.springframework.context.annotation.Conditional;

import java.util.List;

/**
 * @author cws
 */
@Mapper
public interface BookAndClassMapper extends BaseMapper<BookAndClassDO> {
    /**
     * 分页查询所有的信息
     * @param page 分页信息
     * @param wrapper 条件
     * @return 书籍列表
     */
    IPage<BookAndClassDO> quBook(Page<BookAndClassDO> page, @Param(Constants.WRAPPER) Wrapper<BookAndClassDO> wrapper);
}
