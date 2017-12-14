package org.softcits.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.softcits.mbg.model.MbgGroup;
import org.softcits.mbg.model.MbgGroupExample;

public interface MbgGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int countByExample(MbgGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int deleteByExample(MbgGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int insert(MbgGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int insertSelective(MbgGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    List<MbgGroup> selectByExample(MbgGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    MbgGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int updateByExampleSelective(@Param("record") MbgGroup record, @Param("example") MbgGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int updateByExample(@Param("record") MbgGroup record, @Param("example") MbgGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int updateByPrimaryKeySelective(MbgGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbggenerated Fri Sep 08 10:18:30 CST 2017
     */
    int updateByPrimaryKey(MbgGroup record);
}