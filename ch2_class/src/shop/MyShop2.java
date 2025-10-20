package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// MyShop 배열 => 리스트
public class MyShop2 implements IShop {
    private String title;
    // Product[] products = new Product[5];
    List<Product> products = new ArrayList<>(); // 10개 정도를 담을 수 있는 공간 생성

    // 장바구니
    // Product[] carts = new Product[5];
    List<Product> carts = new ArrayList<>();

    // 사용자
    // User[] users = new User[2];
    List<User> users = new ArrayList<>();

    // 선택된 사용자 index
    private int selUser;

    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴
    @Override
    public void start() {
        // 메인화면
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("==============================");

        int i = 0;
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }
        System.out.println("[x]종 료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        switch (sel) {
            case "x":
            case "X":
                System.out.println("프로그램 종료");
                System.exit(0);
                break;

            default:
                selUser = Integer.parseInt(sel);
                break;
        }
        System.out.printf("## %s 선택 ##\n", sel);
        // 상품 목록 메뉴
        productList();

    }

    // 상품 메뉴 출력
    @Override
    public void productList() {
        System.out.println(title + " : 상품 목록 - 상품 선택");
        System.out.println("==============================");
        for (Product product : products) {
            System.out.printf("[%d]", product);
            product.printDetail();
        }
        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크 아웃");
        System.out.print("선택 : ");
        // 상품번호 선택 시 => 비어있는 cart 위치를 찾고 담기
        Scanner sc = new Scanner(System.in);
        // 사용자 입력 : 상품번호, h, c
        String sel = sc.nextLine();

        switch (sel) {
            case "c":
                checkOut();
                break;

            case "h":
                start();
                break;

            default:
                int no = Integer.parseInt(sel);
                carts.add(products.get(no));

                productList();
                break;
        }

    }

    // 결제 처리
    @Override
    public void checkOut() {
        System.out.println(title + " : 체크아웃");
        System.out.println("==============================");
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("==============================");
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전, [q] 결제 완료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("결제 완료");
                System.exit(0);
                break;

            case "p":
                productList();
                break;

            default:
                checkOut();
                break;
        }
    }

    // 사용자등록
    @Override
    public void genUser() {
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));

    }

    // 상품등록
    @Override
    public void genProduct() {
        products.add(new TV("삼성TV", 2300000, "4K"));
        products.add(new TV("LGTV", 2250000, "OLED"));
        products.add(new CellPhone("갤럭시Z폴드", 1200000, "U+"));
        products.add(new CellPhone("갤럭시S23", 600000, "SKT"));
        products.add(new CellPhone("아이폰17", 1200000, "KT"));
    }

}
