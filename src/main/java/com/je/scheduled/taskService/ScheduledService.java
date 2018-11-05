package com.je.scheduled.taskService;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Async
public class ScheduledService {
	@Scheduled(cron = "0/5 * * * * *")
	public void scheduled() {
		log.info("=====>>>>>使用cron  {}", System.currentTimeMillis());
	}

	@Scheduled(fixedRate = 5000)
	public void scheduled1() {
		log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
	}

	@Scheduled(fixedDelay = 5000)
	public void scheduled2() {
		log.info("=====>>>>>fixedDelay{}", System.currentTimeMillis());
	}
}
