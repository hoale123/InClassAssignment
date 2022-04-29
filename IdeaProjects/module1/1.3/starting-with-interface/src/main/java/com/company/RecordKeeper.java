package com.company;

import com.company.interfaces.Auditable;

public class RecordKeeper {
    public static void main(String[] args) {
        SchoolRecord schoolRecord = new SchoolRecord();
                                    //default SchoolRecord Constructor
        TaxRecord taxRecord = new TaxRecord();

        System.out.println("school record");
        schoolRecord.storeData();
        schoolRecord.retrieveData();
        schoolRecord.runAudit();
        schoolRecord.sendAuditToState();

        System.out.println("=====================");
        System.out.println("tax record");
        taxRecord.runAudit();
        taxRecord.sendAuditToState();
        taxRecord.setNameOfTaxedPerson("Matt");
        taxRecord.addW2Information("E-filing");

        Auditable schoolRecord2 = new SchoolRecord();
        Auditable taxRecord2 = new TaxRecord();
        schoolRecord2.runAudit();
        schoolRecord2.sendAuditToState();
//        schoolRecord2.storeData();

        Auditable[] auditableRecords = new Auditable[4];
        auditableRecords[0] = schoolRecord2;
        auditableRecords[1] = taxRecord2;
        auditableRecords[2] = schoolRecord;
        auditableRecords[3] = taxRecord;

        for (int i = 0; i < auditableRecords.length; i++) {
            System.out.println("============ Regular for loop =================");
            auditableRecords[i].runAudit();
            auditableRecords[i].sendAuditToState();
            auditableRecords[i].runComputerCheck();
        }

        for (Auditable a : auditableRecords) {
            System.out.println("============ NEXT =================");
            a.runAudit();
            a.sendAuditToState();
        }

    }
}
