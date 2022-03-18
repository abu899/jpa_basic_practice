package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Order order = new Order();
            order.addOrderItem(new OrderItem());

            Member member = new Member();
            member.addOrder(order);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

    private void dataDrivenStructure(EntityManager em) {
        // 데이터 중심 설계
        // 객체지향스럽지 않고 order가 주문한 member를 찾으려면
        // memberId를 찾고 또 member를 찾아야함
        // sudo code

//        Order order = em.find(Order.class, 1L);
//        Long memberId = order.getMemberId();
//        Member member = em.find(Member.class, memberId);
//        String name = member.getName();

        //
    }

}
