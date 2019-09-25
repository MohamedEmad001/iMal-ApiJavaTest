import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Send_XML_Req {

	public static void main(String[] args) {

		try {
			String url = "http://192.168.16.56:8080/imal_iis_pws_cp_boubyan_s16/pathservices/processCombinedInvestmentDeal?wsdl";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type","text/xml;charset=\"utf-8\"");
			//String countryCode="Canada";
			String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:com=\"combinedInvestmentDealWs\">\r\n" + 
					"   <soapenv:Header/>\r\n" + 
					"   <soapenv:Body>\r\n" + 
					"      <com:createCombinedInvestmentDeal>\r\n" + 
					"         <!--You may enter the following 11 items in any order-->\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <serviceContext>\r\n" + 
					"            <!--You may enter the following 6 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <businessArea>Investment</businessArea>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <businessDomain>InvestmentDeal</businessDomain>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <operationName>createCombinedInvestmentDeal</operationName>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <serviceDomain>CombinedInvestmentDeal</serviceDomain>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <serviceID>7801</serviceID>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <version>1.0</version>\r\n" + 
					"         </serviceContext>\r\n" + 
					"         <companyCode>1</companyCode>\r\n" + 
					"         <branchCode>995</branchCode>\r\n" + 
					"         <productClass>9210</productClass>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <tradeDealCO>\r\n" + 
					"            <!--You may enter the following 66 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <productType>?</productType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <manualReference>?</manualReference>\r\n" + 
					"-->\r\n" + 
					"            <purchaseDealDate>2018-06-01</purchaseDealDate>\r\n" + 
					"            <purchaseValueDate>2018-06-01</purchaseValueDate>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <purchaseDelivery1>ABC</purchaseDelivery1>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <purchaseDelivery2>CDE</purchaseDelivery2>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <purchaseDelivery3>EFG</purchaseDelivery3>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <purchaseDelivery4>GHI</purchaseDelivery4>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <methodOfDealPurchase>?</methodOfDealPurchase>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokeragePurchase>45454545645644</brokeragePurchase>-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokeragePurchaseCy>1</brokeragePurchaseCy>-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokerageTax>543324112343</brokerageTax>-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <receiptNo>78786</receiptNo>-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokerageFee>?</brokerageFee>\r\n" + 
					"-->\r\n" + 
					"            <saleParty>2</saleParty>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDesc>?</saleDesc>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDescArab>?</saleDescArab>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDelivery1>?</saleDelivery1>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDelivery2>?</saleDelivery2>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDelivery3>?</saleDelivery3>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleDelivery4>?</saleDelivery4>\r\n" + 
					"-->\r\n" + 
					"            <saleDealDate>2018-06-01</saleDealDate>\r\n" + 
					"            <saleValueDate>2018-06-01</saleValueDate>\r\n" + 
					"            <saleMaturityDate>2018-07-01</saleMaturityDate>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <saleUnits>?</saleUnits>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <methodOfDealSale>?</methodOfDealSale>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokerageSaleCy>?</brokerageSaleCy>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <downPaymentPerc>?</downPaymentPerc>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <downPayment>?</downPayment>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <downPaymentType>?</downPaymentType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <downPmtWithSalesParty>?</downPmtWithSalesParty>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <templateCode>?</templateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <yield>?</yield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <margin>?</margin>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <agentCif>?</agentCif>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <thirdParty>?</thirdParty>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <limitSerialNumber>?</limitSerialNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealPeriodYield>?</dealPeriodYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <bulkTradeRefNumber>?</bulkTradeRefNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <bulkTradeBranch>?</bulkTradeBranch>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <bulkTradeGainLossAmount>?</bulkTradeGainLossAmount>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <linkTradeDeal>?</linkTradeDeal>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <periodicityNumber>?</periodicityNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <periodicityType>?</periodicityType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <accrualBasis>?</accrualBasis>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <contractPrice>?</contractPrice>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <discountAmount>?</discountAmount>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <discountCalcMethod>?</discountCalcMethod>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <discountPercentage>?</discountPercentage>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <floatRateCode>?</floatRateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <floatRateDate>?</floatRateDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <floatingRate>?</floatingRate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <floatRatePeriodicityNumber>?</floatRatePeriodicityNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <floatRatePeriodicityType>?</floatRatePeriodicityType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <vendorPymtAtTradeDeal_yn>?</vendorPymtAtTradeDeal_yn>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <businessType>?</businessType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <facilityBranch>?</facilityBranch>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <facilityNumber>?</facilityNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <drawDownBranch>?</drawDownBranch>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <drawDownNumber>?</drawDownNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <debitAccountCO>\r\n" + 
					"               <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"            </debitAccountCO>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <creditAccountCO>\r\n" + 
					"              \r\n" + 
					"                <branch>995</branch>\r\n" + 
					"                <currency>1</currency>\r\n" + 
					"                <accGl>930901</accGl>\r\n" + 
					"               <serialNumber>0</serialNumber>\r\n" + 
					"               <cifNumber>0</cifNumber>\r\n" + 
					"<!--               <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"            </creditAccountCO>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <settlementAccountsCO>\r\n" + 
					"-->\r\n" + 
					"              \r\n" + 
					"<!--                <branch>995</branch>-->\r\n" + 
					"<!--                <currency>1</currency>-->\r\n" + 
					"<!--                <accGl>930901</accGl>-->\r\n" + 
					"<!--               <serialNumber>0</serialNumber>-->\r\n" + 
					"<!--               <cifNumber>0</cifNumber>-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--            </settlementAccountsCO>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <thirdPartyAccountsCO>\r\n" + 
					"-->\r\n" + 
					"               <!--You may enter the following 7 items in any order-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <branch>?</branch>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <currency>?</currency>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <accGl>?</accGl>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <serialNumber>?</serialNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <cifNumber>?</cifNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--            </thirdPartyAccountsCO>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <tradeDealsPurchaseDetailsList>\r\n" + 
					"               <!--1 or more repetitions:-->\r\n" + 
					"               <tradeDealsPurchaseDetails>\r\n" + 
					"                  <!--You may enter the following 30 items in any order-->\r\n" + 
					"                  <purchaseParty>00101850</purchaseParty>\r\n" + 
					"                  <itemCode>1</itemCode>\r\n" + 
					"                  <tradeCy>1</tradeCy>\r\n" + 
					"                  <tradeCrossRate>1</tradeCrossRate>\r\n" + 
					"                  <tradeUnitPrice>565</tradeUnitPrice>\r\n" + 
					"                  <purchaseQty>1</purchaseQty>\r\n" + 
					"                  <purchaseCy>1</purchaseCy>\r\n" + 
					"                  <purchaseRate>1</purchaseRate>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <purchaseDesc>?</purchaseDesc>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <purchaseDescArab>?</purchaseDescArab>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <lotNo>?</lotNo>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <supplierInvoiceNumber>?</supplierInvoiceNumber>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <variance>?</variance>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <tradeAmount>565</tradeAmount>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <tradeDiscount>?</tradeDiscount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <tradeDownPaymentAmt>?</tradeDownPaymentAmt>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <purchaseUnitCode>?</purchaseUnitCode>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <purchaseUnits>?</purchaseUnits>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field1>?</field1>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field2>?</field2>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field3>?</field3>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field4>?</field4>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field5>?</field5>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field6>?</field6>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field7>?</field7>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field8>?</field8>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field9>?</field9>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <field10>?</field10>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <purchaseDebitAccount>\r\n" + 
					"                    <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"                  </purchaseDebitAccount>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <purchaseCreditAccount>\r\n" + 
					"                     <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"                  </purchaseCreditAccount>\r\n" + 
					"               </tradeDealsPurchaseDetails>\r\n" + 
					"            </tradeDealsPurchaseDetailsList>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <tradeDealAddtionalFields>\r\n" + 
					"               <!--You may enter the following 15 items in any order-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate1>?</additionalDate1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate2>?</additionalDate2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate3>?</additionalDate3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate4>?</additionalDate4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate5>?</additionalDate5>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber1>?</additionalNumber1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber2>?</additionalNumber2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber3>?</additionalNumber3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber4>?</additionalNumber4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber5>?</additionalNumber5>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString1>?</additionalString1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString2>?</additionalString2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString3>?</additionalString3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString4>?</additionalString4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString5>?</additionalString5>\r\n" + 
					"-->\r\n" + 
					"            </tradeDealAddtionalFields>\r\n" + 
					"         </tradeDealCO>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <investmentDealCO>\r\n" + 
					"            <!--You may enter the following 103 items in any order-->\r\n" + 
					"            <dealDate>2018-06-01</dealDate>\r\n" + 
					"            <valueDate>2018-06-01</valueDate>\r\n" + 
					"            <maturityDate>2018-07-01</maturityDate>\r\n" + 
					"            <yield>5</yield>\r\n" + 
					"            <dealAmount>565</dealAmount>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <downPayment>0</downPayment>-->\r\n" + 
					"            <dealCy>1</dealCy>\r\n" + 
					"            <countryCode>1</countryCode>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <maturityDateHijri>?</maturityDateHijri>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <mgmtPcnt>?</mgmtPcnt>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealRate>?</dealRate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <limitSerialNumber>?</limitSerialNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <sourceOfFund>?</sourceOfFund>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <calendarType>M</calendarType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <restructureDealNumber>?</restructureDealNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <linkedDealBranch>?</linkedDealBranch>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <linkedDealNumber>?</linkedDealNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <tradeRefNumber>?</tradeRefNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <cifIncome>?</cifIncome>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <address1>?</address1>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <address2>?</address2>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <address3>?</address3>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <address4>?</address4>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <streetDetails>?</streetDetails>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <revalType>?</revalType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <countryLimitUtilizedInd>?</countryLimitUtilizedInd>\r\n" + 
					"-->\r\n" + 
					"\r\n" + 
					"<!--            <contact>?</contact>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <telephone>?</telephone>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <fax>?</fax>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <salaryWithBank>?</salaryWithBank>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <agreementDate>?</agreementDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <holidayAction>?</holidayAction>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <ecoSector>?</ecoSector>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <subEcoSector>?</subEcoSector>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <collateralCoverageAgainst>?</collateralCoverageAgainst>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <ripsStructChartNumber>?</ripsStructChartNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <ripsStructDealNumber>?</ripsStructDealNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <autoCreateSettlement>?</autoCreateSettlement>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <settlementAmtInd>?</settlementAmtInd>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <templateCode>?</templateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <lastHolderCif>?</lastHolderCif>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <abiNumber>?</abiNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <settleFromCoveringAcc>?</settleFromCoveringAcc>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <recoverMatAccFrmCover>?</recoverMatAccFrmCover>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <considerOnlineSalBlockYn>?</considerOnlineSalBlockYn>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <linkedAbiNumber>?</linkedAbiNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <reference>?</reference>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <brokerCode>?</brokerCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <periodicityNumber>1</periodicityNumber>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <periodicityType>M</periodicityType>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <finalMaturityDate>?</finalMaturityDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <methodOfDeal>?</methodOfDeal>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <globalRateCode>?</globalRateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <iborPeriodicityNumber>?</iborPeriodicityNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <iborPeriodicityType>?</iborPeriodicityType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <ratePeriodicity>?</ratePeriodicity>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <ratePeriodicityType>?</ratePeriodicityType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <nextRateRevDate>?</nextRateRevDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <valueDateinstruction>?</valueDateinstruction>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <maturityDateInstruction>?</maturityDateInstruction>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <rateDate>?</rateDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <actualNextRateRevDate>?</actualNextRateRevDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <liborRate>?</liborRate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <pointRate>?</pointRate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <minLibor>?</minLibor>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <minYield>?</minYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <maxLibor>?</maxLibor>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <remarks1>?</remarks1>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <remarks2>?</remarks2>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <penalityAmount>?</penalityAmount>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <penalityDaysAfter>?</penalityDaysAfter>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <penalityCeiling>?</penalityCeiling>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <penalityType>?</penalityType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealPeriodYield>?</dealPeriodYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealExpectedYield>?</dealExpectedYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <vatCode>?</vatCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <profitDeclarationPeriodicity>?</profitDeclarationPeriodicity>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <profitDeclarationNumber>?</profitDeclarationNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <expectedRateOfReturn>?</expectedRateOfReturn>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <amendmentDate>?</amendmentDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <chrgPenaltyAfterMaturity>?</chrgPenaltyAfterMaturity>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <classSubCategoryCode>?</classSubCategoryCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <description>?</description>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <insuranceDetails>?</insuranceDetails>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <maxiYield>?</maxiYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <marginRate>?</marginRate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <modaribPartyBank>?</modaribPartyBank>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <payplanTemplateCode>?</payplanTemplateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <productType>?</productType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <profitIndicator>?</profitIndicator>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <rateRevDate>?</rateRevDate>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <investmentDealAddressDetails>\r\n" + 
					"               <!--You may enter the following 41 items in any order-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <region>?</region>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <addressEnglish1>fdgdf</addressEnglish1>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <addressArab1>765765</addressArab1>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressEnglish2>?</addressEnglish2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressArab2>?</addressArab2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressEnglish3>?</addressEnglish3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressArab3>?</addressArab3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressEnglish4>?</addressEnglish4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressArab4>?</addressArab4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <streetDetailsEnglish>?</streetDetailsEnglish>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <streetDetailsArab>?</streetDetailsArab>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <cityEnglish>?</cityEnglish>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <cityArab>?</cityArab>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <cityCode>?</cityCode>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <sectorCode>?</sectorCode>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <addressDescription>?</addressDescription>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <fromDate>?</fromDate>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <toDate>?</toDate>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <expiryDate>?</expiryDate>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <defaultAddress>?</defaultAddress>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <permAddress>?</permAddress>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <country>?</country>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <poboxArea>?</poboxArea>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <poBox>?</poBox>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <postalCode1>?</postalCode1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <homeTelephone>?</homeTelephone>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <workTelephone>?</workTelephone>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <mobile>45654654654</mobile>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <otherTelephone>?</otherTelephone>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <fax>435345345</fax>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <email>dsfsdfds@dfgfd.vvv</email>\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <occupationPosition>?</occupationPosition>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <employerCif>?</employerCif>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <employerName>?</employerName>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <cifIncome>?</cifIncome>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <nationCode>?</nationCode>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <civilId>?</civilId>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <salaryWithBank>?</salaryWithBank>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <relOfficer>?</relOfficer>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <ecoSector>?</ecoSector>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <subEcoSector>?</subEcoSector>\r\n" + 
					"-->\r\n" + 
					"            </investmentDealAddressDetails>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <investmentDealAdditionalFields>\r\n" + 
					"-->\r\n" + 
					"               <!--You may enter the following 15 items in any order-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate1>?</additionalDate1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate2>?</additionalDate2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate3>?</additionalDate3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate4>?</additionalDate4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalDate5>?</additionalDate5>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber1>?</additionalNumber1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber2>?</additionalNumber2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber3>?</additionalNumber3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber4>?</additionalNumber4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalNumber5>?</additionalNumber5>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString1>?</additionalString1>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString2>?</additionalString2>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString3>?</additionalString3>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString4>?</additionalString4>\r\n" + 
					"-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"<!--               <additionalString5>?</additionalString5>\r\n" + 
					"-->\r\n" + 
					"<!--            </investmentDealAdditionalFields>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <contributorDetailsList>\r\n" + 
					"               <!--1 or more repetitions:-->\r\n" + 
					"               <contributorDetails>\r\n" + 
					"                  <!--You may enter the following 9 items in any order-->\r\n" + 
					"                  <partyType>C</partyType>\r\n" + 
					"                  <partyNumber>1</partyNumber>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <mgmtPecentage>0</mgmtPecentage>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <netYield>5</netYield>\r\n" + 
					"                  <contributorAmount>565</contributorAmount>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <valueDate>2018-06-01</valueDate>\r\n" + 
					"                  <maturityAccount>\r\n" + 
					"                     <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"                  </maturityAccount>\r\n" + 
					"                  <partyAccount>\r\n" + 
					"                     <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"                  </partyAccount>\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <nostroAccount>\r\n" + 
					"                     <branch>989</branch>\r\n" + 
					"               <currency>1</currency>\r\n" + 
					"               <accGl>115101</accGl>\r\n" + 
					"               <serialNumber>1</serialNumber>\r\n" + 
					"               <cifNumber>10010</cifNumber>\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"                  </nostroAccount>\r\n" + 
					"               </contributorDetails>\r\n" + 
					"            </contributorDetailsList>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <custGuarLiabilitiesList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <custGuarLiabilities>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 9 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <totalFinancedAmount>?</totalFinancedAmount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <collectedAmount>?</collectedAmount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <dueInstallments>?</dueInstallments>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <installmentAmount>?</installmentAmount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <degreeOfCommitmentEnglish>?</degreeOfCommitmentEnglish>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <degreeOfCommitmentArab>?</degreeOfCommitmentArab>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <lastInstallmentDate>?</lastInstallmentDate>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <notesEnglish>?</notesEnglish>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <notesArab>?</notesArab>\r\n" + 
					"-->\r\n" + 
					"<!--               </custGuarLiabilities>\r\n" + 
					"-->\r\n" + 
					"<!--            </custGuarLiabilitiesList>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--         <linkedGuarantorList>-->\r\n" + 
					"\r\n" + 
					"            \r\n" + 
					"<!--              <linkedGuarantor>-->\r\n" + 
					"\r\n" + 
					"               \r\n" + 
					"<!--               <guarantorCIF>1</guarantorCIF>-->\r\n" + 
					"\r\n" + 
					"           \r\n" + 
					"<!--                 <guarantorAmount>898989898989898</guarantorAmount>-->\r\n" + 
					"\r\n" + 
					"<!--              <account>-->\r\n" + 
					"\r\n" + 
					"                    \r\n" + 
					"<!--                    <branch>1</branch>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                   <currency>1</currency>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                   <accGl>210501</accGl>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                  <serialNumber>0</serialNumber>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                    <cifNumber>2</cifNumber>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                    <ibanAccNumber>?</ibanAccNumber>-->\r\n" + 
					"\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                 <additionalRef>?</additionalRef>-->\r\n" + 
					"<!--               </account>-->\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                 <amountWithCompany>0</amountWithCompany>-->\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                 <amountWithClient>0</amountWithClient>-->\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                 <orderNumber>1</orderNumber>-->\r\n" + 
					"\r\n" + 
					"<!--              </linkedGuarantor>-->\r\n" + 
					"\r\n" + 
					"<!--           </linkedGuarantorList>-->\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--          <linkedDealList>-->\r\n" + 
					"\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--            <linkedDeal>-->\r\n" + 
					"\r\n" + 
					"                  <!--You may enter the following 2 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                 <linkedDealBranch>995</linkedDealBranch>-->\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                 <linkedDealNumber>47548</linkedDealNumber>-->\r\n" + 
					"\r\n" + 
					"<!--              </linkedDeal>-->\r\n" + 
					"\r\n" + 
					"<!--           </linkedDealList>-->\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <coveringAccountsList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <coveringAccount>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 2 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <account>\r\n" + 
					"-->\r\n" + 
					"                     <!--You may enter the following 7 items in any order-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <branch>?</branch>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <currency>?</currency>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <accGl>?</accGl>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <serialNumber>?</serialNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <cifNumber>?</cifNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--                  </account>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <priorityNumber>?</priorityNumber>\r\n" + 
					"-->\r\n" + 
					"<!--               </coveringAccount>\r\n" + 
					"-->\r\n" + 
					"<!--            </coveringAccountsList>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <linkedDocumentList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <linkedDocument>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 3 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <documentCode>?</documentCode>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <loanReferenceNumber>?</loanReferenceNumber>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <dpNoteDate>?</dpNoteDate>\r\n" + 
					"-->\r\n" + 
					"<!--               </linkedDocument>\r\n" + 
					"-->\r\n" + 
					"<!--            </linkedDocumentList>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <collateralDetailsList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <collateralDetails>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 2 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <collateralBranch>?</collateralBranch>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <collateralNumber>?</collateralNumber>\r\n" + 
					"-->\r\n" + 
					"<!--               </collateralDetails>\r\n" + 
					"-->\r\n" + 
					"<!--            </collateralDetailsList>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <profitDeclarationDateList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <profitDeclarationDate>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 2 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <profitDeclarationNumber>?</profitDeclarationNumber>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <profitDeclarationDate>?</profitDeclarationDate>\r\n" + 
					"-->\r\n" + 
					"<!--               </profitDeclarationDate>\r\n" + 
					"-->\r\n" + 
					"<!--            </profitDeclarationDateList>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealchargesList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <dealChargesDet>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 13 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeCode>?</chargeCode>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeAmount>?</chargeAmount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeAccount>\r\n" + 
					"-->\r\n" + 
					"                     <!--You may enter the following 7 items in any order-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <branch>?</branch>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <currency>?</currency>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <accGl>?</accGl>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <serialNumber>?</serialNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <cifNumber>?</cifNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--                  </chargeAccount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <profitOnCharges>?</profitOnCharges>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeAmountCV>?</chargeAmountCV>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeAmountFC>?</chargeAmountFC>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeType>?</chargeType>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <collectChargeAtDeal>?</collectChargeAtDeal>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <collectChargesAccountType>?</collectChargesAccountType>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <chargeAmtPerInstallment>?</chargeAmtPerInstallment>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <vatCode>?</vatCode>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <creditToSDAc565count>?</creditToSDAccount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <creditAdditionalRef>?</creditAdditionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--               </dealChargesDet>\r\n" + 
					"-->\r\n" + 
					"<!--            </dealchargesList>\r\n" + 
					"-->\r\n" + 
					"         </investmentDealCO>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <repaymentPlanCO>\r\n" + 
					"            <!--You may enter the following 37 items in any order-->\r\n" + 
					"            <yield>5</yield>\r\n" + 
					"            <numberOfPayments>1</numberOfPayments>\r\n" + 
					"            <firstPayDate>2018-06-01</firstPayDate>\r\n" + 
					"            <planMaturityDate>2018-06-01</planMaturityDate>\r\n" + 
					"            <accrualBasis>1</accrualBasis>\r\n" + 
					"            <profitCalculationMethod>R</profitCalculationMethod>\r\n" + 
					"            <profitDistMethod>R</profitDistMethod>\r\n" + 
					"            <paymentPeriodicity>D</paymentPeriodicity>\r\n" + 
					"            <paymentPeriodNumber>1</paymentPeriodNumber>\r\n" + 
					"            <paymentPeriodPosition>S</paymentPeriodPosition>\r\n" + 
					"            <paymentResidualAmount>L</paymentResidualAmount>\r\n" + 
					"            <roundingFactor>0</roundingFactor>\r\n" + 
					"            <effectiveYield>5.017178702000</effectiveYield>\r\n" + 
					"            <totalAmount>567.354</totalAmount>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <amountPerPayment>?</amountPerPayment>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <maxYield>?</maxYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <minYield>?</minYield>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <dealPeriodCompounding>?</dealPeriodCompounding>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <gracePeriod>?</gracePeriod>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <gracePeriodicity>?</gracePeriodicity>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <gracePeriodCompounding>?</gracePeriodCompounding>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <templateCode>?</templateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <principalLast>?</principalLast>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <outstdPrincipalAsInstall>?</outstdPrincipalAsInstall>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <equalSegments>?</equalSegments>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <capitalizeProfit>?</capitalizeProfit>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <capitalizePaymPeriodicity>?</capitalizePaymPeriodicity>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <capitalizePaymPeriodPostion>?</capitalizePaymPeriodPostion>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <capitalizePaymPeriodNumber>?</capitalizePaymPeriodNumber>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <calendarType>?</calendarType>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <balloonPayment>1</balloonPayment>-->\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--        <balloonAmount>454545554</balloonAmount>-->\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <numberOfBalloons>?</numberOfBalloons>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <flexiPayments>?</flexiPayments>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <flexiPaymentsMonth>?</flexiPaymentsMonth>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <repaymentPlanScheduleList>\r\n" + 
					"               <!--1 or more repetitions:-->\r\n" + 
					"               <paymentPlanDetails>\r\n" + 
					"                  <lineNumber>1</lineNumber>\r\n" + 
					"                  <valueDate>2018-06-01</valueDate>\r\n" + 
					"                  <paymentType>B</paymentType>\r\n" + 
					"                  <installmentAmount>567.354</installmentAmount>\r\n" + 
					"                  <capitalAmount>565</capitalAmount>\r\n" + 
					"                  <profitAmount>2.354</profitAmount>\r\n" + 
					"                  <actualProfitAmount>2.354</actualProfitAmount>\r\n" + 
					"                    <amount>567.354</amount>\r\n" + 
					"				<capitalAmountBeforeXIRR>565</capitalAmountBeforeXIRR>\r\n" + 
					"           <profitAmountBeforeXIRR>2.354</profitAmountBeforeXIRR>\r\n" + 
					"               </paymentPlanDetails>\r\n" + 
					"            </repaymentPlanScheduleList>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <repaymentCriteriaList>\r\n" + 
					"-->\r\n" + 
					"               <!--Zero or more repetitions:-->\r\n" + 
					"<!--               <repaymentCriteria>\r\n" + 
					"-->\r\n" + 
					"                  <!--You may enter the following 13 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <lineNumber>?</lineNumber>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <fromDate>?</fromDate>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <toDate>?</toDate>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <paymPeriodNumber>?</paymPeriodNumber>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <paymentType>?</paymentType>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <paymPeriodicity>?</paymPeriodicity>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <paymPeriodPosition>?</paymPeriodPosition>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <paymentDay>?</paymentDay>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <account>\r\n" + 
					"-->\r\n" + 
					"                     <!--You may enter the following 7 items in any order-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <branch>?</branch>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <currency>?</currency>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <accGl>?</accGl>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <serialNumber>?</serialNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <cifNumber>?</cifNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--                  </account>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <coveringAccount>\r\n" + 
					"-->\r\n" + 
					"                     <!--You may enter the following 7 items in any order-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <branch>?</branch>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <currency>?</currency>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <accGl>?</accGl>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <serialNumber>?</serialNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <cifNumber>?</cifNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <ibanAccNumber>?</ibanAccNumber>\r\n" + 
					"-->\r\n" + 
					"                     <!--Optional:-->\r\n" + 
					"<!--                     <additionalRef>?</additionalRef>\r\n" + 
					"-->\r\n" + 
					"<!--                  </coveringAccount>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <autoCreateSettlement>?</autoCreateSettlement>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <numberOfPayments>?</numberOfPayments>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <capitalAmt>?</capitalAmt>\r\n" + 
					"-->\r\n" + 
					"<!--               </repaymentCriteria>\r\n" + 
					"-->\r\n" + 
					"<!--            </repaymentCriteriaList>\r\n" + 
					"-->\r\n" + 
					"         </repaymentPlanCO>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <paymentInstructionCO>\r\n" + 
					"            <!--You may enter the following 7 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <valueDate>2018-06-01</valueDate>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"<!--            <templateCode>?</templateCode>\r\n" + 
					"-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"           <trxMethod>T</trxMethod>\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"           <paymentVia>S</paymentVia>\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"           <transferMethod>2</transferMethod>\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"           <swiftType>B</swiftType>\r\n" + 
					"\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"           <swiftDetails>\r\n" + 
					"\r\n" + 
					"               <!--You may enter the following 20 items in any order-->\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <intermBank>\r\n" + 
					"\r\n" + 
					"                  <!--You may enter the following 8 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <bankNumber>166005</bankNumber>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <bic>1</bic>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                <name>TEST</name>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <branch>989</branch>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <accountNumber>199206</accountNumber>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"               <address>abc</address>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <address1>acv</address1>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                <address2>lal</address2>\r\n" + 
					"\r\n" + 
					"          </intermBank>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <swiftSendReceive>12</swiftSendReceive>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <swiftMessage>CHE</swiftMessage>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <swiftSendReceive1>21</swiftSendReceive1>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <swiftMessage1>bonol</swiftMessage1>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"            <swiftCharge>SHA</swiftCharge>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <beneficiaryBank>\r\n" + 
					"\r\n" + 
					"                  <!--You may enter the following 8 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <bankNumber>166005</bankNumber>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                  <bic>1</bic>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                <name>lal</name>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <branch>989</branch>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"               <accountNumber>199206</accountNumber>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <address>lal1</address>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <address1>ll1</address1>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <address2>moorthy</address2>\r\n" + 
					"\r\n" + 
					"            </beneficiaryBank>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"            <remarkTag72>oakokokokokoko</remarkTag72>\r\n" + 
					"         \r\n" + 
					"\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <instruction1>rewr</instruction1>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <instruction2>erwew</instruction2>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <instruction3>ewrr</instruction3>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <instruction4>ewrewr</instruction4>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <remark1>erew</remark1>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"               <remark2>ewrew</remark2>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <partyBank>12345689</partyBank>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <partyBankDescriprtionEnglish>dfsaf</partyBankDescriprtionEnglish>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <partyAccountNumber>6216</partyAccountNumber>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"              <sortCode>5</sortCode>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"             <bic>2</bic>\r\n" + 
					"\r\n" + 
					"               <!--Optional:-->\r\n" + 
					"            <swiftAdditionalDetails>\r\n" + 
					"\r\n" + 
					"                  <!--You may enter the following 36 items in any order-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"               <continuation>7</continuation>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"               <certificateNo1>65765</certificateNo1>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                <certificateNo2>kjhhhhhhhhhhjjjjjjjjjjjjjjjjjhhhhhhhhhhjkjhhhhhhhh</certificateNo2>\r\n" + 
					"\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo3>?</certificateNo3>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo4>?</certificateNo4>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo5>?</certificateNo5>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo6>?</certificateNo6>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo7>?</certificateNo7>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo8>?</certificateNo8>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo9>?</certificateNo9>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo10>?</certificateNo10>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo11>?</certificateNo11>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo12>?</certificateNo12>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo13>?</certificateNo13>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo14>?</certificateNo14>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo15>?</certificateNo15>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo16>?</certificateNo16>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo17>?</certificateNo17>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo18>?</certificateNo18>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo19>?</certificateNo19>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo20>?</certificateNo20>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo21>?</certificateNo21>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo22>?</certificateNo22>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo23>?</certificateNo23>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo24>?</certificateNo24>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo25>?</certificateNo25>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo26>?</certificateNo26>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo27>?</certificateNo27>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo28>?</certificateNo28>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo29>?</certificateNo29>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo30>?</certificateNo30>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo31>?</certificateNo31>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo32>?</certificateNo32>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo33>?</certificateNo33>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"<!--                  <certificateNo34>?</certificateNo34>\r\n" + 
					"-->\r\n" + 
					"                  <!--Optional:-->\r\n" + 
					"                 <certificateNo35>56546</certificateNo35>\r\n" + 
					"\r\n" + 
					"              </swiftAdditionalDetails>\r\n" + 
					"\r\n" + 
					"         </swiftDetails>\r\n" + 
					"\r\n" + 
					"         </paymentInstructionCO>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <requestContext>\r\n" + 
					"            <!--You may enter the following 3 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <requestID>1</requestID>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <coreRequestTimeStamp>2017-02-01T00:00:00</coreRequestTimeStamp>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <requestKernelDetails>1</requestKernelDetails>\r\n" + 
					"         </requestContext>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <requesterContext>\r\n" + 
					"            <!--You may enter the following 7 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <channelID>1</channelID>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <hostName>1</hostName>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <hashKey>1</hashKey>\r\n" + 
					"            <langId>EN</langId>\r\n" + 
					"            <password>MTIz</password>\r\n" + 
					"            <requesterTimeStamp>2017-02-01T00:00:00</requesterTimeStamp>\r\n" + 
					"            <userID>MODEL.B</userID>\r\n" + 
					"         </requesterContext>\r\n" + 
					"         <!--Optional:-->\r\n" + 
					"         <vendorContext>\r\n" + 
					"            <!--You may enter the following 3 items in any order-->\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <license>Copyright 2018 Path Solutions. All Rights Reserved</license>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <providerCompanyName>Path Solutions</providerCompanyName>\r\n" + 
					"            <!--Optional:-->\r\n" + 
					"            <providerID>IMAL</providerID>\r\n" + 
					"         </vendorContext>\r\n" + 
					"      </com:createCombinedInvestmentDeal>\r\n" + 
					"   </soapenv:Body>\r\n" + 
					"</soapenv:Envelope>";
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(xml);
			wr.flush();
			wr.close();
			String responseStatus = con.getResponseMessage();
			System.out.println(responseStatus);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println("response:" + response.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
