import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Invoice> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> firstFiveIds = new ArrayList<>();

        invoices.add(new Invoice(1, "Training cust", Customer.ORACLE, 10000));
        invoices.add(new Invoice(2, "Supervising", Customer.MICROSOFT, 25000));
        invoices.add(new Invoice(3, "Training agents", Customer.MICROSOFT, 15000));
        invoices.add(new Invoice(4, "Training", Customer.ORACLE, 30000));
        invoices.add(new Invoice(5, "Another Training", Customer.ORACLE, 5000));
        invoices.add(new Invoice(6, "Maintaining and Training", Customer.MICROSOFT, 20000));
        invoices.add(new Invoice(7, "Yet another Training", Customer.ORACLE, 22500));
        invoices.add(new Invoice(8, "Another Maintaining and Training", Customer.MICROSOFT, 35000));
        invoices.add(new Invoice(9, "Yet another Training huh", Customer.ORACLE, 21500));
        invoices.add(new Invoice(10, "Yet another Training again", Customer.ORACLE, 23500));

//        for (Invoice inv: invoices
//             ) {
//            if (inv.getCustomer() == Customer.ORACLE){
//                if (inv.getTitle().contains("Training")){
//                    oracleAndTrainingInvoices.add(inv);
//                }
//            }
//        }
        oracleAndTrainingInvoices = invoices.stream()
                .filter(invoice -> invoice.getCustomer()== Customer.ORACLE && invoice.getTitle().contains("Training"))
                .collect(Collectors.toList());

        System.out.println(oracleAndTrainingInvoices);

//        Collections.sort(oracleAndTrainingInvoices, new Comparator<Invoice>() {
//            @Override
//            public int compare(Invoice o1, Invoice o2) {
//                return Double.compare(o1.getAmount(), o2.getAmount());
//            }
//        });
        oracleAndTrainingInvoices = oracleAndTrainingInvoices.stream()
                                .sorted((o1, o2) -> Double.compare(o1.getAmount(), o2.getAmount()))
                                .collect(Collectors.toList());
        System.out.println(oracleAndTrainingInvoices);

//        for (Invoice inv: oracleAndTrainingInvoices
//             ) {
//            ids.add(inv.getId());
//        }
        ids = oracleAndTrainingInvoices.stream()
                .map(Invoice::getId)
                .collect(Collectors.toList());
        System.out.println(ids);

//        for (int i = 0; i < 5 ; i++) {
//            firstFiveIds.add((ids.get(i)));
//        }
        firstFiveIds = ids.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(firstFiveIds);
    }
}
