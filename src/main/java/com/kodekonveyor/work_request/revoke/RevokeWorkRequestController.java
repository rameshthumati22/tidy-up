package com.kodekonveyor.work_request.revoke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kodekonveyor.work_request.WorkRequestRepository;

@Controller
public class RevokeWorkRequestController {

  @Autowired
  private WorkRequestRepository workRequestRepository;

  public void call(final String workRequestId) {
    workRequestRepository.deleteById(Long.parseLong(workRequestId));
  }

}
