package com.check.mybatisConfig;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.check.mapper"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisDbBConfig {


    @Autowired
    @Qualifier("ds")
    private DataSource ds;


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        // 使用titan数据源, 连接titan库
        factoryBean.setDataSource(ds);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*.xml"));
        return factoryBean.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(ds);
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        // 使用上面配置的Factory
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory());
        return template;
    }
}
