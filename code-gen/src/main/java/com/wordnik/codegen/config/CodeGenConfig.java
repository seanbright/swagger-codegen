package com.wordnik.codegen.config;

import java.util.List;

/**
 * Sets the configurations required for the code generation
 *
 * User: ramesh
 * Date: 5/25/11
 * Time: 8:39 AM
 */
public class CodeGenConfig {


    private String classFileExtension;

    /**
     *  Default model imports that we need to include in all service classes. This is needed because some times,
     *  we may need to write custom classes and those classes will not be known to code generation. To import those
     *  classes in service classes we use this property
     */
    private List<String> defaultModelImports;

    /**
     *  Default service imports that we need to include in all service classes. This is needed because some times,
     *  we may need to write custom classes ans those classes will not be known to code generation. To import those
     *  classes in service classes we use this property
     */
    private List<String> defaultServiceImports;

    private String modelPackageName;

    private String apiPackageName;

    private String exceptionPackageName;

    private String annotationPackageName;

    private CodeGenOverridingRules codeGenOverridingRules;

    private DataTypeMapper dataTypeMapper;

    private ServiceAndMethodNameGenerator nameGenerator;

    public String getClassFileExtension() {
        return classFileExtension;
    }

    public void setClassFileExtension(String classFileExtension) {
        this.classFileExtension = classFileExtension;
    }

    public List<String> getDefaultModelImports() {
        return defaultModelImports;
    }

    public void setDefaultModelImports(List<String> defaultModelImports) {
        this.defaultModelImports = defaultModelImports;
    }

    public List<String> getDefaultServiceImports() {
        return defaultServiceImports;
    }

    public void setDefaultServiceImports(List<String> defaultServiceImports) {
        this.defaultServiceImports = defaultServiceImports;
    }

    public CodeGenOverridingRules getCodeGenOverridingRules() {
        return codeGenOverridingRules;
    }

    public void setCodeGenOverridingRules(CodeGenOverridingRules codeGenOverridingRules) {
        this.codeGenOverridingRules = codeGenOverridingRules;
    }

    public DataTypeMapper getDataTypeMapper() {
        return dataTypeMapper;
    }

    public void setDataTypeMapper(DataTypeMapper dataTypeMapper) {
        this.dataTypeMapper = dataTypeMapper;
    }

    public ServiceAndMethodNameGenerator getNameGenerator() {
        return nameGenerator;
    }

    public void setNameGenerator(ServiceAndMethodNameGenerator nameGenerator) {
        this.nameGenerator = nameGenerator;
    }

    public String getExceptionPackageName() {
        return exceptionPackageName;
    }

    public void setExceptionPackageName(String exceptionPackageName) {
        this.exceptionPackageName = exceptionPackageName;
    }

    public String getAnnotationPackageName() {
        return annotationPackageName;
    }

    public void setAnnotationPackageName(String annotationPackageName) {
        this.annotationPackageName = annotationPackageName;
    }

    public String getModelPackageName() {
        return modelPackageName;
    }

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    public String getApiPackageName() {
        return apiPackageName;
    }

    public void setApiPackageName(String apiPackageName) {
        this.apiPackageName = apiPackageName;
    }
}