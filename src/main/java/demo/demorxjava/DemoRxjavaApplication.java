package demo.demorxjava;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class DemoRxjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRxjavaApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner() {
		return e -> {
			log.info("this is runner");

			Observable.just(1,2,3,4,5,6)
					.subscribeOn(Schedulers.io())
					.map(x-> {
						return x * x;
					})
					.subscribe( x -> {
						log.info(x.toString());
						Thread.sleep(1000);
					});

			Observable.just(1,2,3,4,5,6)
					.subscribeOn(Schedulers.io())
					.map(x-> {
						return x * x;
					})
					.subscribe( x -> {
						log.info(x.toString());
						Thread.sleep(1000);
					});

			Observable.just(1,2,3,4,5,6)
					.subscribeOn(Schedulers.io())
					.map(x-> {
						return x * x;
					})
					.subscribe( x -> {
						log.info(x.toString());
						Thread.sleep(1000);
					});

			Observable.just(1,2,3,4,5,6)
					.subscribeOn(Schedulers.io())
					.map(x-> {
						return x * x;
					})
					.subscribe( x -> {
						log.info(x.toString());
						Thread.sleep(1000);
					});

			Observable.just(1,2,3,4,5,6)
					.subscribeOn(Schedulers.io())
					.map(x-> {
						return x * x;
					})
					.subscribe( x -> {
						log.info(x.toString());
						Thread.sleep(1000);
					});

			log.info("end....");
		};
	}
}
