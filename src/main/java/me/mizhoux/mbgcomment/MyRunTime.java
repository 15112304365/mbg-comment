package me.mizhoux.mbgcomment;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.MessageFormat;
import java.util.List;

/**
 * @author monkey king
 * @date 2020-09-23 22:56:07
 */
public class MyRunTime extends IntrospectedTableMyBatis3Impl {

    //@Override
    //protected String calculateMyBatis3XmlMapperFileName() {
    //    StringBuilder sb = new StringBuilder();
    //    if (StringUtility.stringHasValue(tableConfiguration.getMapperName())) {
    //        String mapperName = tableConfiguration.getMapperName();
    //        int ind = mapperName.lastIndexOf('.');
    //        if (ind != -1) {
    //            mapperName = mapperName.substring(ind + 1);
    //        }
    //        //支持mapperName = "{0}Dao" 等用法
    //        sb.append(MessageFormat.format(mapperName, fullyQualifiedTable.getDomainObjectName()));
    //        sb.append(".xml"); //$NON-NLS-1$
    //    } else {
    //        sb.append(fullyQualifiedTable.getDomainObjectName());
    //        sb.append("Mapper.xml"); //$NON-NLS-1$
    //    }
    //    return sb.toString();
    //}
    //
    //@Override
    //protected void calculateJavaClientAttributes() {
    //    if (context.getJavaClientGeneratorConfiguration() == null) {
    //        return;
    //    }
    //
    //    StringBuilder sb = new StringBuilder();
    //    sb.append(calculateJavaClientImplementationPackage());
    //    sb.append('.');
    //    sb.append(fullyQualifiedTable.getDomainObjectName());
    //    sb.append("DAOImpl"); //$NON-NLS-1$
    //    setDAOImplementationType(sb.toString());
    //
    //    sb.setLength(0);
    //    sb.append(calculateJavaClientInterfacePackage());
    //    sb.append('.');
    //    sb.append(fullyQualifiedTable.getDomainObjectName());
    //    sb.append("DAO"); //$NON-NLS-1$
    //    setDAOInterfaceType(sb.toString());
    //
    //    sb.setLength(0);
    //    sb.append(calculateJavaClientInterfacePackage());
    //    sb.append('.');
    //    if (StringUtility.stringHasValue(tableConfiguration.getMapperName())) {
    //        //支持mapperName = "{0}Dao" 等用法
    //        sb.append(MessageFormat.format(tableConfiguration.getMapperName(), fullyQualifiedTable.getDomainObjectName()));
    //    } else {
    //        sb.append(fullyQualifiedTable.getDomainObjectName());
    //        sb.append("Mapper"); //$NON-NLS-1$
    //    }
    //    setMyBatis3JavaMapperType(sb.toString());
    //
    //    sb.setLength(0);
    //    sb.append(calculateJavaClientInterfacePackage());
    //    sb.append('.');
    //    if (StringUtility.stringHasValue(tableConfiguration.getSqlProviderName())) {
    //        //支持mapperName = "{0}SqlProvider" 等用法
    //        sb.append(MessageFormat.format(tableConfiguration.getSqlProviderName(), fullyQualifiedTable.getDomainObjectName()));
    //    } else {
    //        sb.append(fullyQualifiedTable.getDomainObjectName());
    //        sb.append("SqlProvider"); //$NON-NLS-1$
    //    }
    //    setMyBatis3SqlProviderType(sb.toString());
    //}


    @Override
    protected void calculateXmlAttributes() {
        setIbatis2SqlMapPackage(calculateSqlMapPackage());
        setIbatis2SqlMapFileName(calculateIbatis2SqlMapFileName());
        setMyBatis3XmlMapperFileName(calculateMyBatis3XmlMapperFileName());
        setMyBatis3XmlMapperPackage(calculateSqlMapPackage());

        setIbatis2SqlMapNamespace(calculateIbatis2SqlMapNamespace());
        setMyBatis3FallbackSqlMapNamespace(calculateMyBatis3FallbackSqlMapNamespace());

        setSqlMapFullyQualifiedRuntimeTableName(calculateSqlMapFullyQualifiedRuntimeTableName());
        setSqlMapAliasedFullyQualifiedRuntimeTableName(calculateSqlMapAliasedFullyQualifiedRuntimeTableName());

        setCountByExampleStatementId("countByExample"); //$NON-NLS-1$
        setDeleteByExampleStatementId("deleteByExample"); //$NON-NLS-1$
        setDeleteByPrimaryKeyStatementId("deleteByPrimaryKey"); //$NON-NLS-1$
        setInsertStatementId("insert"); //$NON-NLS-1$
        setInsertSelectiveStatementId("insertSelective"); //$NON-NLS-1$
        setSelectAllStatementId("selectAll"); //$NON-NLS-1$
        setSelectByExampleStatementId("selectByExample"); //$NON-NLS-1$
        setSelectByExampleWithBLOBsStatementId("selectByExampleWithBLOBs"); //$NON-NLS-1$
        setSelectByPrimaryKeyStatementId("selectByPrimaryKey"); //$NON-NLS-1$
        setUpdateByExampleStatementId("updateByExample"); //$NON-NLS-1$
        setUpdateByExampleSelectiveStatementId("updateByExampleSelective"); //$NON-NLS-1$
        setUpdateByExampleWithBLOBsStatementId("updateByExampleWithBLOBs"); //$NON-NLS-1$
        setUpdateByPrimaryKeyStatementId("updateByPrimaryKey"); //$NON-NLS-1$
        setUpdateByPrimaryKeySelectiveStatementId("updateByPrimaryKeySelective"); //$NON-NLS-1$
        setUpdateByPrimaryKeyWithBLOBsStatementId("updateByPrimaryKeyWithBLOBs"); //$NON-NLS-1$
        setBaseResultMapId("BaseResultMap"); //$NON-NLS-1$
        setResultMapWithBLOBsId("ResultMapWithBLOBs"); //$NON-NLS-1$
        setExampleWhereClauseId("Example_Where_Clause"); //$NON-NLS-1$
        setBaseColumnListId("Base_Column_List"); //$NON-NLS-1$
        setBlobColumnListId("Blob_Column_List"); //$NON-NLS-1$
        setMyBatis3UpdateByExampleWhereClauseId("Update_By_Example_Where_Clause"); //$NON-NLS-1$

        //重新对常用的方法进行改名字
        setDeleteByPrimaryKeyStatementId("deleteObject"); //$NON-NLS-1$
        setInsertSelectiveStatementId("saveObject"); //$NON-NLS-1$
        setSelectByPrimaryKeyStatementId("getObjectById"); //$NON-NLS-1$
        setUpdateByPrimaryKeySelectiveStatementId("updateObject"); //$NON-NLS-1$
    }
}
