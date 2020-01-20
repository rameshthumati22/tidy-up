package com.kodekonveyor.work_request.offer;

import java.util.List;

import com.kodekonveyor.work_request.WorkRequestEntityTestData;

public class GiveofferControllerTestData {

  public static final String INVALID_PRICE = "Invalid Price";
  public static final String NEGATIVE_PRICE_EXCEPTION =
      "Price cannot be negative";
  public static final String NON_POSITIVE_WORK_REQUEST_ID_EXCEPTION =
      "Work Request Id should be positive";

  public static final String INVALID_WORK_REQUEST_ID_EXCEPTION =
      "Invalid work request Id";

  public static final Long PRICE = 234L;

  public static final Long PRICE_ID = 1L;

  public static OfferEntity get() {
    final OfferEntity offerEntity = new OfferEntity();
    offerEntity.setId(PRICE_ID);
    offerEntity.setPrice(PRICE);
    offerEntity.setWorkRequestId(WorkRequestEntityTestData.WORK_REQUEST_ID);
    return offerEntity;

  }

  public static List<OfferEntity> list() {
    return List.of(get());
  }
}
