public class SearchProduct {


    public static Product linearSearch(Product[] products, String name) {


        for(Product p : products) {


            if(p.name.equalsIgnoreCase(name)) {

                return p;

            }

        }

        return null;

    }


    public static void main(String[] args) {


        Product[] products = {


            new Product(101,"Camera",45000),

            new Product(102,"Keyboard",1500),

            new Product(103,"Laptop",75000),

            new Product(104,"Mouse",800),

            new Product(105,"Phone",35000)

        };


        Product result = linearSearch(products,"Laptop");


        if(result != null) {


            System.out.println("Product Found");

            System.out.println("ID : " + result.id);

            System.out.println("Name : " + result.name);

            System.out.println("Price : " + result.price);


        }

        else {

            System.out.println("Product Not Found");

        }


    }

}