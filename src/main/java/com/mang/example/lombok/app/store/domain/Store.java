package com.mang.example.lombok.app.store.domain;

import com.mang.example.lombok.app.common.domain.Common;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "store")
@ToString(exclude = "regionMoneyName", callSuper = true)
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = {"companyName", "roadAddr"}, callSuper = false)
public class Store extends Common {

    private String companyName;                                 // 상호명
    private String industryTypeCode;                            // 업종코드
    private String businessCodeName;                            // 업태명
    private String industryName;                                // 업종명(종목명)
    private String telephone;                                   // 전화번호
    private String regionMoneyName;                             // 사용가능한 지역화폐 명
    private boolean isBmoneyPossible;                           // 지류형 지역화폐 사용가능 여부
    private boolean isCardPossible;                             // 카드형 지역화폐 사용가능 여부
    private boolean isMobilePossible;                           // 모바일형 지역화폐 사용가능 여부
    private String lotnoAddr;                                   // 소재지 지번주소
    private String roadAddr;                                    // 소재지 도로명주소
    private String zipCode;                                     // 우편번호
    private double longitude;                                   // 경도
    private double latitude;                                    // 위도
    private String sigunCode;                                   // 시군 코드
    private String sigunName;                                   // 시군 이름

    @Builder
    public Store(String companyName, String industryTypeCode){
        this.companyName = companyName;
        this.industryTypeCode = industryTypeCode;
    }

}
