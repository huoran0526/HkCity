//package com.example.demo.dao;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.entity.Demo;
//
///**
// * Created by huoran
// */
//@Repository("DemoDaoImpl")
//public class DemoDaoImpl implements DemoDao {
//    // springboot会默认自动将数据源中的配置注入,用法与hibernate中sessionFactory生成的session类似。以后使用多数据源时会详细解释
//	@Autowired
//	@PersistenceContext
//    EntityManager entityManager;
//
////    /**
////     *
////     * @return
////     */
////    @Override
////    public Demo getDemo() {
////        //编写jpql语句，进行执行回去所需数据
////        List<Demo> resultList = entityManager.createQuery("FROM Student")
////                .setFirstResult(0)
////                .setMaxResults(1)
////                .getResultList();
////        if (resultList.size() == 0) {
////            return null;
////        }
////        return resultList.get(0);
////    }
//	
//	/**
//     * 获取一个同学的信息
//     * @return
//     */	
//	@Override
//	public Demo findByName(String name) {
//		return null;
//	}
//}