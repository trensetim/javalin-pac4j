module javalin.pac4j {
    requires pac4j.core;
    requires io.javalin;
    requires org.slf4j;
    requires javax.servlet.api;
    opens org.pac4j.javalin;
    exports org.pac4j.javalin;
}