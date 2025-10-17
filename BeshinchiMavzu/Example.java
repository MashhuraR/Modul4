package BeshinchiMavzu;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sonni kiriting:");
        int son=scanner.nextInt();
        System.out.println("Sonni kiriting:");
        int son2=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Amalni tanlang:+,-,*,/");
        String belgi=scanner.nextLine();
        switch (belgi){
            case "+"->{
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Ma'lumotlar yuklanmoqda...");
                    return son+son2;
                }).thenApply(result->
                        "Natija: "+result
                ).thenAccept(System.out::println);

            }
            case "-"->{
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Ma'lumotlar yuklanmoqda...");
                    return son-son2;
                }).thenApply(result->
                        "Natija: "+result
                ).thenAccept(System.out::println);

            }
            case "*"->{
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Ma'lumotlar yuklanmoqda...");
                    return son*son2;
                }).thenApply(result->
                        "Natija: "+result
                ).thenAccept(System.out::println);

            }
            case "/"->{
                if(son2!=0) {
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("Ma'lumotlar yuklanmoqda...");
                        return son / son2;
                    }).thenApply(result ->
                            "Natija: " + result
                    ).thenAccept(System.out::println);
                }
            }


        }

    }
}
