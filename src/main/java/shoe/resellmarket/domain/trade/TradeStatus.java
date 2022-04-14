package shoe.resellmarket.domain.trade;

/**
 * PRE_CONCLUSION: 거래 체결전
 * PRE_SELLER_SHIPMENT: 판매자 발송 대기
 * PRE_WAREHOUSING: 입고 대기(판매자 -> 회사)
 * INSPECTION: 검수
 * PRE_SHIPMENT: 검수후 발송 대기
 * SHIPPING: 배송중(회사 -> 구매자)
 * COMPLETE: 거래 완료
 * CANCEL: 취소(판매자가 기간 내 상품 미발송 및 검수 -> 부적합)
 */
public enum TradeStatus {
    PRE_CONCLUSION, PRE_SELLER_SHIPMENT, PRE_WAREHOUSING,
    INSPECTION, PRE_SHIPMENT, SHIPPING,
    COMPLETE, CANCEL,
}
