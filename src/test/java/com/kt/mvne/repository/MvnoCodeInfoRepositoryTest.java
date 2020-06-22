package com.kt.mvne.repository;

import com.kt.mvne.domain.MvnoCodeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MvnoCodeInfoRepositoryTest {

    @Autowired
    MvnoCodeInfoRepository mvnoCodeInfoRepository;

    @Test
    public void insertTest() {

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custTypeCd",
                "고객유형코드",
                "고객 형태별 유형 구분",
                "I",
                "개인고객",
                2,
                1,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custTypeCd",
                "고객유형코드",
                "고객 형태별 유형 구분",
                "B",
                "법인",
                2,
                2,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custTypeCd",
                "고객유형코드",
                "고객 형태별 유형 구분",
                "G",
                "공공기관",
                2,
                3,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custIdntNoIndCd",
                "고객식별번호 구분코드",
                "고객유형별 식별할 수 있는 번호",
                "01",
                "주민등록번호, 운전면허번호, 대한민국여권번호, 장애인등록증번호, 국가유공자번호",
                20,
                1,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custIdntNoIndCd",
                "고객식별번호 구분코드",
                "고객유형별 식별할 수 있는 번호",
                "02",
                "사업자등록번호",
                20,
                2,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custIdntNoIndCd",
                "고객식별번호 구분코드",
                "고객유형별 식별할 수 있는 번호",
                "03",
                "법인번호",
                20,
                3,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custIdntNoIndCd",
                "고객식별번호 구분코드",
                "고객유형별 식별할 수 있는 번호",
                "04",
                "여권번호",
                20,
                4,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("custIdntNoIndCd",
                "고객식별번호 구분코드",
                "고객유형별 식별할 수 있는 번호",
                "05",
                "외국인등록번호",
                20,
                5,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("billAcntIndCd",
                "청구계정 구분코드",
                "선/후불 구분",
                "R",
                "일반 후불",
                2,
                1,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("billAcntIndCd",
                "청구계정 구분코드",
                "선/후불 구분",
                "I",
                "지능망 선불",
                2,
                2,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "REGID",
                "주민등록증",
                6,
                1,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "NAMEC",
                "대한민국여권",
                6,
                2,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "DRIVE",
                "운전면허증",
                6,
                3,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "FORGN",
                "외국인등록증",
                6,
                4,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "PPORT",
                "외국인여권",
                6,
                5,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "HANDI",
                "장애인등록증",
                6,
                6,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("nativeRlnamAthnEvdnPprCd",
                "개인실명인증증빙코드",
                "개인 실명인증 증빙수단 코드",
                "MERIT",
                "국가유공자증",
                6,
                7,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "01",
                "자영업",
                3,
                1,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "02",
                "회사원",
                3,
                2,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "03",
                "공무원",
                3,
                3,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "04",
                "투자기관직원",
                3,
                4,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "05",
                "주부",
                3,
                5,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "06",
                "학생",
                3,
                6,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "07",
                "농,수산업 등",
                3,
                7,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "10",
                "교사",
                3,
                8,
                true));

        mvnoCodeInfoRepository.save(new MvnoCodeInfo("JobCd",
                "직업코드",
                "개인 고객 직업 코드",
                "99",
                "기타",
                3,
                9,
                true));

    }

}