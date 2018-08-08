package cn.security.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by viruser on 2018/8/8.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private FailureHandler failureHandler;
    @Autowired
    private SuccessHandler successHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and().formLogin().loginPage("/hello").loginProcessingUrl("/login").permitAll()
                .failureHandler(failureHandler).successHandler(successHandler)
                .and().logout().permitAll()
                .and().csrf().disable();
//        http.formLogin()          // 定义当需要用户登录时候，转到的登录页面。
//                .and()
//                .authorizeRequests()    // 定义哪些URL需要被保护、哪些不需要被保护
//                .anyRequest()        // 任何请求,登录后可以访问
//                .authenticated();
    }
}
