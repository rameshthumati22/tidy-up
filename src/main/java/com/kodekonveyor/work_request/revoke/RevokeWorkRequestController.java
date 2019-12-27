package com.kodekonveyor.work_request.revoke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.kodekonveyor.work_request.WorkRequestRepository;

@Controller
public class RevokeWorkRequestController {

  @Autowired
  private WorkRequestRepository workRequestRepository;

  @DeleteMapping("/workRequest/remove/@workRequestId")
  public void call(final Long workRequestId) {
    workRequestRepository.deleteById(workRequestId);
  }

}
