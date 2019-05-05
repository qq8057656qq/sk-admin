package com.dxj.domain;

import lombok.Data;
import javax.persistence.*;

/**
 * 代码生成配置
 * @author jie
 * @date 2019-01-03
 */
@Data
@Entity
@Table(name = "gen_config")
public class GenConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 包路径 **/
    private String pack;

    /** 模块名 **/
    @Column(name = "module_name")
    private String moduleName;

    /** 前端文件路径 **/
    private String path;

    /** 前端文件路径 **/
    @Column(name = "api_path")
    private String apiPath;

    /** 作者 **/
    private String author;

    /** 是否覆盖 **/
    private Boolean cover;
}