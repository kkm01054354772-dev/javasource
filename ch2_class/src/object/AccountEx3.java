package object;

import java.util.Scanner;

public class AccountEx3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Account[] accounts;
        accounts = new Account[100];
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택 >>");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:
                    deposit(accounts);
                    break;
                case 4:
                    withdraw(accounts);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("번호를 확인하세요.");
                    break;
            }
        }

        // accountlist(accounts);

    }

    static void createAccount(Account[] accounts) {
        // 계좌생성
        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                break;
            }
        }
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("===================================");
                System.out.println("계좌번호 : " + account.getAccountNo());
                System.out.println("계좌주 : " + account.getOwner());
                System.out.println("잔액 : " + account.getBalance());
            }
        }
    }

    static void deposit(Account[] accounts) {
        // 입금
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            System.out.print("입금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            account.deposit(amount);

        }
    }

    static void withdraw(Account[] accounts) {
        // 출금
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            System.out.print("출금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            long balance = account.withdraw(amount);
            System.out.println("현재 잔액 : " + balance);
        }

    }

    static Account findAccount(Account[] accounts) {
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        for (Account account : accounts) {
            if (account != null) {
                if (account.getAccountNo().equals(accountNo))
                    return account;
            }
        }
        return null;
    }

}
