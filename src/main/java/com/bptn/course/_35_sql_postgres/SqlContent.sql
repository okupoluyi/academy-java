--CREATE TABLE "courses" (
--	"courseId" INT GENERATED ALWAYS AS IDENTITY,
--	"courseName" VARCHAR(120) NOT NULL,
--	CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")
--
--);
--
--CREATE TABLE "students" (
--	"studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
--	"courseId" INT NOT NULL,
--	"studentName" VARCHAR(120) NOT NULL,
--	"studentEmail" VARCHAR(120) UNIQUE NOT NULL,
--	"studentPhone" VARCHAR(20),
--	FOREIGN KEY ("courseId")
--		REFERENCES courses("courseId")
--		ON UPDATE NO ACTION
--		ON DELETE NO ACTION
--		NOT VALID
--);
--
--CREATE TABLE "product"(
-- 	"productId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
--	"name" VARCHAR(100) NOT NULL,
-- 	 "price" MONEY NOT NULL,
-- 	"price" DECIMAL (10,2) NOT NULL
-- );
--
-- CREATE TABLE "users"(
--	"userId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
--	"username" VARCHAR(100) NOT NULL,
--    "email" VARCHAR(100) NOT NULL,
-- 	"address" TEXT,
--	"createdAt" TIMESTAMP DEFAULT CURRENT_TIMESTAMP
-- );
--
---- INSERT INTO product ("name", "price") VALUES ('Laptop', 990.00);
--
---- SELECT * FROM product;
--
--
--

-- CREATE TABLE "courses" (
-- 	"courseId" INT GENERATED ALWAYS AS IDENTITY,
-- 	"courseName" VARCHAR(120) NOT NULL,
-- 	CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")

-- );

-- CREATE TABLE "students" (
-- 	"studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
-- 	"courseId" INT NOT NULL,
-- 	"studentName" VARCHAR(120) NOT NULL,
-- 	"studentEmail" VARCHAR(120) UNIQUE NOT NULL,
-- 	"studentPhone" VARCHAR(20),
-- 	FOREIGN KEY ("courseId")
-- 		REFERENCES courses("courseId")
-- 		ON UPDATE NO ACTION
-- 		ON DELETE NO ACTION
-- 		NOT VALID
-- );

-- -- CREATE DATABASE ecommerce_store;

-- -- DROP DATABASE ecommerce_store;

-- -- CREATE DATABASE ecommerceStore;

-- CREATE TABLE "product"(
-- 	"productId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
-- 	"name" VARCHAR(100) NOT NULL,
--  	-- "price" MONEY NOT NULL,
-- 	"price" DECIMAL (10,2) NOT NULL
-- );

-- INSERT INTO "courses" ("courseName") VALUES
-- ('Introduction to Computer Science'),
-- ('Data Structures and Algorithms'),
-- ('Database Management Systems'),
-- ('Web Development Fundamentals'),
-- ('Artificial Intelligence Basics'),
-- ('Machine Learning Fundamentals'),
-- ('Software Engineering Principles'),
-- ('Computer Networks and Security'),
-- ('Operating Systems Concepts'),
-- ('Object-Oriented Programming'),
-- ('Introduction to Python Programming'),
-- ('Java Programming Essentials'),
-- ('C++ Programming Fundamentals'),
-- ('Data Analytics Techniques'),
-- ('Information Retrieval Methods'),
-- ('Mobile App Development'),
-- ('Human-Computer Interaction'),
-- ('Computer Graphics and Visualization'),
-- ('Cloud Computing Technologies'),
-- ('Big Data Analytics');

-- INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone") VALUES
-- (1, 'John Smith', 'john.smith@gmail.com', '4165551234'),
-- (1, 'Emily Johnson', 'emily.johnson@yahoo.com', '6475552345'),
-- (2, 'Michael Davis', 'michael.davis@hotmail.com', '9055553456'),
-- (2, 'Sophia Brown', 'sophia.brown@gmail.com', '+14165554567'),
-- (3, 'William Wilson', 'william.wilson@yahoo.com', '647-555-5678'),
-- (3, 'Olivia Taylor', 'olivia.taylor@hotmail.com', '9055556789'),
-- (4, 'James Anderson', 'james.anderson@gmail.com', '416-555-7890'),
-- (4, 'Ava Thomas', 'ava.thomas@yahoo.com', '6475558901'),
-- (5, 'Benjamin Martinez', 'benjamin.martinez@hotmail.com', '9055559012'),
-- (5, 'Mia Hernandez', 'mia.hernandez@gmail.com', '4165550123'),
-- (6, 'Daniel Lopez', 'daniel.lopez@yahoo.com', '6475551234'),
-- (6, 'Charlotte Clark', 'charlotte.clark@hotmail.com', '9055552345'),
-- (7, 'Joseph Lewis', 'joseph.lewis@gmail.com', '4165553456'),
-- (7, 'Amelia Lee', 'amelia.lee@yahoo.com', '6475554567'),
-- (8, 'David Walker', 'david.walker@hotmail.com', '9055555678'),
-- (8, 'Sofia Hall', 'sofia.hall@gmail.com', '4165556789'),
-- (9, 'Andrew Young', 'andrew.young@yahoo.com', '6475557890'),
-- (9, 'Harper Hernandez', 'harper.hernandez@hotmail.com', '9055558901'),
-- (10, 'Alexander King', 'alexander.king@gmail.com', '416-555-9012'),
-- (10, 'Abigail White', 'abigail.white@yahoo.com', '6475550123'),
-- (11, 'Ethan Hill', 'ethan.hill@hotmail.com', '9055551234'),
-- (11, 'Emily Adams', 'emily.adams@gmail.com', '4165552345'),
-- (12, 'James Wright', 'james.wright@yahoo.com', '6475553456'),
-- (13, 'Avery Scott', 'avery.scott@hotmail.com', '9055554567'),
-- (14, 'Logan Green', 'logan.green@gmail.com', '4165555678'),
-- (15, 'Ella Martinez', 'ella.martinez@yahoo.com', '6475556789'),
-- (16, 'Lucas Rodriguez', 'lucas.rodriguez@hotmail.com', '9055557890'),
-- (17, 'Scarlett Perez', 'scarlett.perez@gmail.com', '4165558901'),
-- (18, 'Henry Cooper', 'henry.cooper@yahoo.com', '6475559012'),
-- (19,  'Jane Smith',   'jane@gmail.com', NULL),
-- (5,   'Bob Wilson',  'bob@hotmail.com', NULL);

-- ========READ=========================
-- SELECT * FROM courses;
-- SELECT * FROM students;

-- SELECT "studentName", "studentEmail", "studentPhone" FROM students WHERE "studentPhone" IS NULL;

 --SELECT * FROM students WHERE "studentId" = 1;
 
-- SELECT * FROM students WHERE "studentId">4 OR "studentName"='John Smith';

-- SELECT * FROM students WHERE "courseId"=15 AND "studentName"='Ella Martinez';
-- SELECT * FROM students WHERE "courseId"=15 AND "studentName" LIKE '%Mar%';
-- SELECT * FROM students WHERE "courseId"=15 AND "studentName" LIKE 'El%';
 -- SELECT * FROM students WHERE "courseId" != 4;
 
 -- =================UPDATE ======================
-- UPDATE students SET "studentName" = 'John', "studentEmail"= 'john@hello.com' WHERE "studentId" = 1;

-- =================DELETE ======================
 -- DELETE FROM students WHERE "studentId" = 1;
 
 
 -- SELECT * FROM courses
 -- FULL JOIN "students" ON courses."courseId" = students."courseId";
 
--  SELECT s.id, c.id, s.studentName, c.courseName
--  FROM students
--  AS s
--  INNER JOIN courses
--  AS c
--  ON s.id = c.id;
 
--  CREATE TABLE bootcamp
--  (id INTEGER PRIMARY KEY,
--  name VARCHAR(10),
--  code CHAR(10),
--  startDate DATE,
--  createdAt TIMESTAMP,
--  price FLOAT
--  );

-- DROP TABLE "bootcamp";

-- DROP TABLE IF EXISTS "accounts";

-- CREATE TABLE "accounts" (
--     "id" INT GENERATED BY DEFAULT AS IDENTITY,
--     "name" VARCHAR(100) NOT NULL,
--     "balance" DEC(15,2) NOT NULL,
--     PRIMARY KEY("id")
-- );

-- INSERT INTO "accounts"("name", "balance")
-- VALUES('Bob', 10000);

-- SELECT * FROM "accounts";

-- BEGIN;

-- INSERT INTO "accounts"("name", "balance") VALUES('Alice', 10000);

-- COMMIT;

-- SELECT * FROM "accounts";

-- BEGIN;

-- INSERT INTO "accounts"("name", "balance") VALUES('Jack', 0);

-- COMMIT;

-- SELECT * FROM "accounts";


-- ========================================
-- Create a transaction which debits 500 from the account balance for account 2 and credit this to account 3
-- ========================================

-- BEGIN;

-- UPDATE accounts SET "balance" = "balance"-500 WHERE "id"=2;

-- UPDATE accounts SET "balance" = "balance"+500 WHERE "id"=3;

-- COMMIT;

-- ========================================

-- SELECT * FROM accounts;


-- ========================================
                 -- TRIGGER
-- ========================================

-- CREATE FUNCTION addFiveDollars() RETURNS TRIGGER AS
-- $$
-- BEGIN
-- 	UPDATE accounts SET "balance" = "balance"+5;
-- END;
-- $$ LANGUAGE plpgsql;


-- CREATE TRIGGER triggerFiveDollarBonus AFTER UPDATE ON accounts
-- FOR EACH ROW EXECUTE PROCEDURE addFiveDollars();


-- UPDATE accounts SET "name" = 'Bob New' WHERE "id"=1;

-- SELECT * FROM accounts;

-- CREATE TABLE "user" (
-- 	"userId" INT GENERATED BY DEFAULT AS IDENTITY
-- 	"firstName" VARCHAR NOT NULL,
-- 	"lastName" VARCHAR NOT NULL,
-- 	"username" VARCHAR NOT NULL,
--     "phone VARCHAR NOT NULL,
--     emailId" VARCHAR NOT NULL,
--     "password" VARCHAR NOT NULL,
--     "emailVerified" BOOLEAN NOT NULL DEFAULT FALSE,
--     "createdOn" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
	
-- 	CONSTRAINT "User_pkey" PRIMARY KEY ("userId"),
--     CONSTRAINT "User_emailId_key" UNIQUE (emailId),
--     CONSTRAINT "User_username_key" UNIQUE (username)
-- );

-- INSERT INTO "user" (firstName, lastName, username, phone, emailId, password, emailVerified)
-- VALUES ('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');

-- SELECT * FROM User;

-- INSERT INTO "user" (firstName, lastName, username, phone, emailId, password, emailVerified)
-- VALUES 
-- ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
-- ('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
-- ('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW())
-- );


-- SELECT * FROM "user" WHERE "emailVerified" = true;


-- INSERT INTO User (firstName, lastName, username, phone, emailId, password, emailVerified)
-- VALUES 
--     ('David', 'Evans', 'davidevans', '567-890-1234', 'davidevans@example.com', 'securepassword4', TRUE),
--     ('Eva', 'Foster', 'evafoster', '678-901-2345', 'evafoster@example.com', 'securepassword5', FALSE),
--     ('Frank', 'Green', 'frankgreen', '789-012-3456', 'frankgreen@example.com', 'securepassword6', TRUE),
--     ('Grace', 'Hall', 'gracehall', '890-123-4567', 'gracehall@example.com', 'securepassword7', TRUE);


-- UPDATE "user"
-- SET "username" = 'randyjones' WHERE "username" = 'tomjones';

-- SELECT * FROM "user" WHERE "username" = 'tomjones';


-- DELETE FROM User WHERE username = 'randyjones';

-- CREATE TABLE "User"(
--   "userId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
--   "firstName" VARCHAR(100) NOT NULL,
--   "lastName" VARCHAR(100) NOT NULL,
--   "username" VARCHAR(100) NOT NULL,
--   "phone" VARCHAR(100) NOT NULL,
--   "emailId" VARCHAR(100) NOT NULL,
--   "password" VARCHAR(100) NOT NULL,
--   "emailVerified" BOOLEAN NOT NULL DEFAULT FALSE,
--   "createdOn" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--   CONSTRAINT "userPKey" PRIMARY KEY ("userId"),
--   CONSTRAINT "userEmailIdKey" UNIQUE ("emailId"),
--   CONSTRAINT "userUsernameKey" UNIQUE ("username")
-- );

-- SELECT * FROM "User";

-- INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
-- VALUES ('Jessie', 'Doe','jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');

-- INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
-- VALUES 
--   ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
--   ('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
--   ('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());

-- SELECT * FROM "User" WHERE "emailVerified"=true;

-- INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
-- VALUES 
--   ('Bob', 'Marley', 'bmarley', '+1-222-9012', 'bmarley@example.com', 'password789', 'true', NOW()),
-- 	 ('Fela', 'Kuti', 'fkuti', '+1-567-9012', 'felakuti@example.com', 'password789', 'true', NOW()),
--   ('Justin', 'Trudeau', 'jtrudeau', '+1-589-9012', 'jtrudeau@example.com', 'password789', 'false', NOW()),
--   ('Kamala', 'Harris', 'kharris', '+1-565-3456', 'kharris@example.com', 'passwordabc', 'false', NOW()),
--   ('Elon', 'Musk', 'emusk', '+1-682-3456', 'emusk@example.com', 'password123', 'false', NOW());
  
--   SELECT * FROM "User";

-- UPDATE "User" SET "username"='randyjones' WHERE "username"='tomjones';

-- SELECT * FROM "User" WHERE "username"='tomjones';

-- SELECT * FROM "User" WHERE "username" = 'randyjones';

-- DELETE FROM "User" WHERE "username"='randyjones';

-- CREATE TABLE "Profile"(
--   "profileId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
--   "userId" INT NOT NULL,
--   "headline" VARCHAR(100) NOT NULL,
--   "picture" VARCHAR(100) NOT NULL,
--   "bio" VARCHAR(500),
--   "city" VARCHAR(100),
--   "country" VARCHAR(100),
--   CONSTRAINT "Profile_pkey" PRIMARY KEY ("profileId"),
--   CONSTRAINT "Profile_userId_fkey" FOREIGN KEY("userId") REFERENCES "User"("userId")
-- );

-- SELECT * FROM "Profile";

-- INSERT INTO "Profile" ("userId", "headline", "bio", "city", "country", "picture")
-- VALUES (2, 'Wondergirl Amy!', 'My name is Amy and I am a super hero.', 'Toronto', 'Canada', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg');



-- INSERT INTO "Profile" ("userId", "headline", "bio", "city", "country", "picture")
-- VALUES 
--     (3, 'Jessie the Fighter', 'Adventure awaits!', 'Vancouver', 'Canada', 'https://bptn.com/jessie.jpg'),
--     (4, 'Diana the Wise', 'Knowledge is power.', 'London', 'Canada', 'https://bptn.com/diana.jpg');

-- SELECT * FROM "Profile" WHERE "country" = 'Canada';

-- UPDATE "Profile"
-- SET "bio" = 'I am Amy and I probably shouldn''t tell anyone I''m a super hero'
-- WHERE "userId" = 2;

-- INSERT INTO "Profile" ("userId", "headline", "bio", "city", "country", "picture")
--   VALUES 
--     (5, 'Diana the Foolish', 'Knowledge is power.', 'London', 'Canada', 'https://bptn.com/diana.jpg');

--SELECT * FROM "Profile";

-- DELETE FROM "Profile" WHERE "profileId = 7";

--SELECT * FROM "Profile" WHERE "userId" = 4;


-- SELECT * FROM "User"
-- LEFT JOIN "Profile" ON "User"."userId" = "Profile"."userId";

-- SELECT * FROM "User"
-- JOIN "Profile" ON "User.userId" = "Profile.userId";

