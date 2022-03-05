/**
 * 
 */
package 다단계_칫솔;

/**
 * 
 *
 * @author 유영훈
 * @since 2021. 10. 9
 */
public class Person {
    String name;
    Person referral;
    int profit;
    
    /**
     * 
     *
     * @author 유영훈
     * @since 2021. 10. 9
     */
    public Person(String name) {
        this.name = name;
        this.referral = null;
        this.profit = 0;
    }
}
