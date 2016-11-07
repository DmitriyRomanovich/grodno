CREATE TABLE "сustomers" (
	"customer_id" serial NOT NULL,
	"customer_name" VARCHAR(256) UNIQUE,
	"customer_pass" VARCHAR(256),
	"right_id" integer NOT NULL,
	CONSTRAINT сustomers_pk PRIMARY KEY ("customer_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "accounts" (
	"account_id" serial NOT NULL,
	"customer_id" integer NOT NULL,
	"account_name" VARCHAR(256) UNIQUE,
	"current_ballance" FLOAT NOT NULL,
	"account_mail" VARCHAR(256) UNIQUE,
	CONSTRAINT accounts_pk PRIMARY KEY ("account_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Payments" (
	"payment_id" serial NOT NULL,
	"account_id" integer NOT NULL,
	"product_id" integer NOT NULL,
	"payment_metod_code" integer NOT NULL,
	"payment_status_code" integer NOT NULL,
	"date_of_payment" DATE NOT NULL,
	"amount_of_payment" integer NOT NULL,
	"payment_details" VARCHAR(256) NOT NULL,
	CONSTRAINT Payments_pk PRIMARY KEY ("payment_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "subscription" (
	"subscription_id" serial NOT NULL,
	"account_id" integer NOT NULL,
	"date_subscription_placed" DATE NOT NULL,
	"subscription_details" VARCHAR(256) NOT NULL,
	"payment_id" integer NOT NULL,
	"date_subscription_off" DATE NOT NULL,
	CONSTRAINT subscription_pk PRIMARY KEY ("subscription_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "pay_Metod" (
	"payment_metod_code" serial NOT NULL,
	"payment_metod_name" VARCHAR(256),
	CONSTRAINT pay_Metod_pk PRIMARY KEY ("payment_metod_code")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "pay_status" (
	"payment_status_code" serial NOT NULL,
	"payment_status" BOOLEAN,
	CONSTRAINT pay_status_pk PRIMARY KEY ("payment_status_code")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "catalog" (
	"product_id" serial NOT NULL,
	"product_name" VARCHAR(256),
	"product_price" FLOAT NOT NULL,
	"categories_id" integer NOT NULL,
	"years_id" integer NOT NULL,
	CONSTRAINT catalog_pk PRIMARY KEY ("product_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "categories" (
	"categories_id" serial UNIQUE,
	"categories_name" VARCHAR(256) NOT NULL,
	CONSTRAINT categories_pk PRIMARY KEY ("categories_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "years" (
	"years_id" serial UNIQUE,
	"years_name" integer UNIQUE,
	CONSTRAINT years_pk PRIMARY KEY ("years_id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "right" (
	"right_id" serial NOT NULL,
	"right_name" VARCHAR(256),
	CONSTRAINT right_pk PRIMARY KEY ("right_id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "сustomers" ADD CONSTRAINT "сustomers_fk0" FOREIGN KEY ("right_id") REFERENCES "right"("right_id");

ALTER TABLE "accounts" ADD CONSTRAINT "accounts_fk0" FOREIGN KEY ("customer_id") REFERENCES "сustomers"("customer_id");

ALTER TABLE "Payments" ADD CONSTRAINT "Payments_fk0" FOREIGN KEY ("account_id") REFERENCES "accounts"("account_id");
ALTER TABLE "Payments" ADD CONSTRAINT "Payments_fk1" FOREIGN KEY ("product_id") REFERENCES "catalog"("product_id");
ALTER TABLE "Payments" ADD CONSTRAINT "Payments_fk2" FOREIGN KEY ("payment_metod_code") REFERENCES "pay_Metod"("payment_metod_code");
ALTER TABLE "Payments" ADD CONSTRAINT "Payments_fk3" FOREIGN KEY ("payment_status_code") REFERENCES "pay_status"("payment_status_code");

ALTER TABLE "subscription" ADD CONSTRAINT "subscription_fk0" FOREIGN KEY ("account_id") REFERENCES "accounts"("account_id");
ALTER TABLE "subscription" ADD CONSTRAINT "subscription_fk1" FOREIGN KEY ("payment_id") REFERENCES "Payments"("payment_id");



ALTER TABLE "catalog" ADD CONSTRAINT "catalog_fk0" FOREIGN KEY ("categories_id") REFERENCES "categories"("categories_id");
ALTER TABLE "catalog" ADD CONSTRAINT "catalog_fk1" FOREIGN KEY ("years_id") REFERENCES "years"("years_id");




