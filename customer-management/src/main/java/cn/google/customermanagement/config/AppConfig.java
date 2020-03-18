package cn.google.customermanagement.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@ComponentScan(basePackages = {"cn.google.customermanagement"})//扫描包
@Configuration
@PropertySource(value= "classpath:jdbc.properties")
public class AppConfig {

    @Value("${user_name}")
    private String userName;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

    @Value("${diverClassName}")
    private String diverClassName;


    @Bean("druidDataSource")
    public DataSource createDruidDBCPDataSource(){
        DruidDataSource ds=new DruidDataSource();
        ds.setUsername(this.userName);
        ds.setPassword(this.password);
        ds.setUrl(this.url);
        ds.setDriverClassName(this.diverClassName);
        ds.setInitialSize(20);//初始化大小
        ds.setMaxActive(5);//最小连接数
        ds.setMaxActive(20);
        ds.setMaxWait(50000);
        ds.setPoolPreparedStatements(true);
        ds.setMaxPoolPreparedStatementPerConnectionSize(20);
        return ds;
    }
}
