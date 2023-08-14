package week002.day5;

public class LSH_05 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s)
                + overwrite_string
                + my_string.substring(s+overwrite_string.length());
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        LSH_05 lsh05 = new LSH_05();
        lsh05.solution("He11oWor1d", "lloWorl", 2);
    }
}



//                    if (clientConfig.getType().toLowerCase().contains("sms")) {
//                            log.info("여기까지 들어왔는지 확인해보겠습니다 8");
//                            smsTableName = dbConfig.getSmsTableName();
//                            log.info("smsTableName : " + smsTableName);
//                            if (smsTableName == null) {
//                            log.info("Agent Type is SMS, SMS Table Name is null, Check your Configuration ");
//                            }
//
//                            if (smsTpsLimiter == null) { // 40이 나와야 정상
//                            log.info("smsTpsLimiter 을 확인해보겠습니다. : {}", smsTpsLimiter);
//                            log.info("여기까지 들어왔는지 확인해보겠습니다 9");
//                            log.info("clientConfig.getTps 확인 : {}", clientConfig.getTps());
//                            if (clientConfig.getTps() > 0) {
//                            smsTpsLimiter = new TpsLimiter(clientConfig.getTps());
//                            log.info("if문 smsTpsLimiter : {}", smsTpsLimiter);
//                            } else {
//                            smsTpsLimiter = new TpsLimiter(40); //초당 40번의 요청을 함
//                            log.info("else문 smsTpsLimiter : {}", smsTpsLimiter);
//                            }
//                            }
//                            log.info("clientConfig.getSendType() 확인을 해보즈앗 : {}", clientConfig.getSendType());
//                            if (clientConfig.getSendType().toLowerCase().contains("real")) {
//                            log.info("여기까지 들어왔는지 확인해보겠습니다 10 여기 부분은 real 인 메시지가 들어왔는지 확인을 해보도록 하겠습니다.");
//                            if (smsRealFetcher == null) {
//                            smsRealFetcher = new SMSFetcher(clientConfig, smsService, dbConfig, hikariConfig, "R", this, authencationManager, smsTpsLimiter, customCodeConverter);
//                            }
//                            } else { //batch 타입
//                            log.info("B타입 들어왔는지 확인해보겠습니다.");
//                            if (smsBatchFetcher == null) {
//                            smsBatchFetcher = new SMSFetcher(clientConfig, smsService, dbConfig, hikariConfig, "B", this, authencationManager, smsTpsLimiter, customCodeConverter);
//                            }
//                            }
//
//
//                            if (smsRealFetcher != null || smsBatchFetcher != null) {
//                            log.info("SMS Fetcher make Success");
//                            makeSuccess = true;
//                            }