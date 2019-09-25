package hw13;



    public class Work {

        public static void main(String[] args) {

            RestaurantAddress one1 = new RestaurantAddress("123 main", "Miami", 33160);
            Dish pelmeni = new Dish("Pelmeni", "Sour cream");
            Menu mainCourse = new Menu(pelmeni, "Sour Cream", "Napoleon");
            Employee one = new Employee("123A");
            Waiter vasya = new Waiter("Ivanov", "Vasya", one);


            Restaurant cheburechnya = new Restaurant("Cheburechnaya", one1, mainCourse, 50, 5000, vasya);

            String cheburechnya1 = cheburechnya.getWaiter().getEmployee().id;
            System.out.println(cheburechnya1);

            String pelmeni1 = cheburechnya.getMenu().getDish().dish;
            System.out.println(pelmeni1);
        }
        }














