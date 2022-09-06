package kakao_tech_internship;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public String solution(String[] survey, int[] choices) {
        //정답 선택지를 사용하기 쉽게 문자열 배열로 묶음
        String[] strs={"RT","CF","JM","AN"};

        //알파벳 크기만큼 만들어서 각자 알파벳마다 점수를넣어줌
        int[] score=new int[26];

        //정답 문자열 만들기 위한 객체
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<survey.length;i++){
            char c1=survey[i].charAt(0);
            char c2=survey[i].charAt(1);

            //4를 기준으로 저장해야하는 값 경우의수 분리
            if(choices[i]<4){
                score[c1-'A']+=Math.abs(choices[i]-4);
            }
            if(choices[i]>4){
                score[c2-'A']+=Math.abs(choices[i]-4);
            }

        }
        //선택지에서 높은점수 기준으로 문자열에 삽입하고 같으면 사전순으로 먼저 나오는 값을 삽입
       for(int i=0;i< strs.length;i++){
           if(score[strs[i].charAt(0)-'A']>score[strs[i].charAt(1)-'A']){
               sb.append(strs[i].charAt(0));
           }
           if(score[strs[i].charAt(0)-'A']<score[strs[i].charAt(1)-'A']){
               sb.append(strs[i].charAt(1));
           }
           if(score[strs[i].charAt(0)-'A']==score[strs[i].charAt(1)-'A']){
                if(strs[i].charAt(0)-'A'<strs[i].charAt(1)-'A'){
                    sb.append(strs[i].charAt(0));
                }
               if(strs[i].charAt(0)-'A'>strs[i].charAt(1)-'A'){
                   sb.append(strs[i].charAt(1));
               }
           }
       }
        return sb.toString();
    }
}
