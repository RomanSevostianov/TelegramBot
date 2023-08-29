FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=ReminderGoodSkyBot
ENV BOT_TOKEN=6673035824:AAG7Ewt_hFgkB9l1bMDBm-jmHgtLgaRGcx0
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]


#FROM adoptopenjdk/openjdk11:ubi
#ARG JAR_FILE=target/*.jar
#ENV BOT_NAME=ReminderGoodSkyBot
#ENV BOT_TOKEN=6673035824:AAG7Ewt_hFgkB9l1bMDBm-jmHgtLgaRGcx0
#ENV BOT_DB_USERNAME=postgres
#ENV BOT_DB_PASSWORD=postgres
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-Dspring.datasource.username=${BOT_DB_USERNAME}", "-jar", "app.jar"]