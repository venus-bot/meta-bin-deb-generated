PACKAGES = "${PN} libevent-2.1-6 libevent-core-2.1-6 libevent-dev libevent-extra-2.1-6 libevent-openssl-2.1-6 libevent-pthreads-2.1-6"
PROVIDES = "libevent-2.1-6 libevent-core-2.1-6 libevent-dev libevent-extra-2.1-6 libevent-openssl-2.1-6 libevent-pthreads-2.1-6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-core-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-dev_2.1.8-stable-4_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-extra-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-openssl-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb4\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-pthreads-2.1-6_2.1.8-stable-4_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.1-6 = "libevent-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "0b402d498908b6fd86ba983906e6b677895ab6984451355200c990eba2228e5d"
SRC_URI[deb0.md5sum] = "3e5d5f0772071eecc55d151489ea8cd6"
DEBFILENAME_libevent-core-2.1-6 = "libevent-core-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb1.sha256sum] = "d856de33ce2617c67662400bb3caca1408d489c88fe036387ab1f98c9c13eff8"
SRC_URI[deb1.md5sum] = "f2f58526b5531fc5e08779e705a64822"
DEBFILENAME_libevent-dev = "libevent-dev_2.1.8-stable-4_armhf.deb"
SRC_URI[deb2.sha256sum] = "0b29d7464522810afb22ddcb1ffea508f41a2b510d9bf5ea1ba94068f73a5a45"
SRC_URI[deb2.md5sum] = "6e883ab2a99063bc00b46f84b93c12c1"
DEBFILENAME_libevent-extra-2.1-6 = "libevent-extra-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb3.sha256sum] = "c988554b497236685aaad4327989f7bba0f860496f95109adf45fec3915229bc"
SRC_URI[deb3.md5sum] = "8c095baaf8d1f0a73505d2f2fed364b9"
DEBFILENAME_libevent-openssl-2.1-6 = "libevent-openssl-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb4.sha256sum] = "a5a0ad32848ad2cd6ed32ed5a7ede7387c04d5c181bfadaebd2bbb5a878110e7"
SRC_URI[deb4.md5sum] = "2433c322a84a444e85606cf34f447984"
DEBFILENAME_libevent-pthreads-2.1-6 = "libevent-pthreads-2.1-6_2.1.8-stable-4_armhf.deb"
SRC_URI[deb5.sha256sum] = "9237958b20c45aa939b4f5768b236efcf96d4fca74c9227813e96d88396e6ea3"
SRC_URI[deb5.md5sum] = "a6e7cc9a2f1dbbd9b74f66f6dc526008"

RDEPENDS_${PN}-2.1-6 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-core-2.1-6 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-dev = "libevent-2.1-6 (= 2.1.8-stable-4) libevent-core-2.1-6 (= 2.1.8-stable-4) libevent-extra-2.1-6 (= 2.1.8-stable-4) libevent-openssl-2.1-6 (= 2.1.8-stable-4) libevent-pthreads-2.1-6 (= 2.1.8-stable-4)"
RDEPENDS_${PN}-extra-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4)"
RDEPENDS_${PN}-openssl-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4) libssl1.1 (>= 1.1.0)"
RDEPENDS_${PN}-pthreads-2.1-6 = "libc6 (>= 2.4) libevent-core-2.1-6 (= 2.1.8-stable-4)"
DEPENDS = "libc6 libssl1.1"


inherit deb_group

FILES_libevent-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-2.1-6/copyright\
"
FILES_libevent-core-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_core-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-core-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-core-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-core-2.1-6/copyright\
"
FILES_${PN}-dev = " \
    ./usr/include/evdns.h \
    ./usr/include/event.h \
    ./usr/include/event2/buffer.h \
    ./usr/include/event2/buffer_compat.h \
    ./usr/include/event2/bufferevent.h \
    ./usr/include/event2/bufferevent_compat.h \
    ./usr/include/event2/bufferevent_ssl.h \
    ./usr/include/event2/bufferevent_struct.h \
    ./usr/include/event2/dns.h \
    ./usr/include/event2/dns_compat.h \
    ./usr/include/event2/dns_struct.h \
    ./usr/include/event2/event-config.h \
    ./usr/include/event2/event.h \
    ./usr/include/event2/event_compat.h \
    ./usr/include/event2/event_struct.h \
    ./usr/include/event2/http.h \
    ./usr/include/event2/http_compat.h \
    ./usr/include/event2/http_struct.h \
    ./usr/include/event2/keyvalq_struct.h \
    ./usr/include/event2/listener.h \
    ./usr/include/event2/rpc.h \
    ./usr/include/event2/rpc_compat.h \
    ./usr/include/event2/rpc_struct.h \
    ./usr/include/event2/tag.h \
    ./usr/include/event2/tag_compat.h \
    ./usr/include/event2/thread.h \
    ./usr/include/event2/util.h \
    ./usr/include/event2/visibility.h \
    ./usr/include/evhttp.h \
    ./usr/include/evrpc.h \
    ./usr/include/evutil.h \
    ./usr/lib/arm-linux-gnueabihf/libevent.a \
    ./usr/lib/arm-linux-gnueabihf/libevent.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_core.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_core.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_core.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_extra.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
    ./usr/share/doc/libevent-dev/TODO.Debian \
    ./usr/share/doc/libevent-dev/changelog.Debian.gz \
    ./usr/share/doc/libevent-dev/changelog.gz \
    ./usr/share/doc/libevent-dev/copyright \
    ./usr/share/doc/libevent-dev/examples/Makefile.sample \
    ./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
    ./usr/share/doc/libevent-dev/examples/event-read-fifo.c \
    ./usr/share/doc/libevent-dev/examples/hello-world.c \
    ./usr/share/doc/libevent-dev/examples/hostcheck.c.gz \
    ./usr/share/doc/libevent-dev/examples/http-connect.c \
    ./usr/share/doc/libevent-dev/examples/http-server.c.gz \
    ./usr/share/doc/libevent-dev/examples/https-client.c.gz \
    ./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
    ./usr/share/doc/libevent-dev/examples/openssl_hostname_validation.c.gz \
    ./usr/share/doc/libevent-dev/examples/signal-test.c \
    ./usr/share/doc/libevent-dev/examples/time-test.c \
    ./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
    ./usr/share/doc/libevent-dev/whatsnew-2.1.txt.gz\
"
FILES_libevent-extra-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_extra-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-extra-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-extra-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-extra-2.1-6/copyright\
"
FILES_libevent-openssl-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-openssl-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-openssl-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-openssl-2.1-6/copyright\
"
FILES_libevent-pthreads-2.1-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.1.so.6.0.2 \
    ./usr/share/doc/libevent-pthreads-2.1-6/changelog.Debian.gz \
    ./usr/share/doc/libevent-pthreads-2.1-6/changelog.gz \
    ./usr/share/doc/libevent-pthreads-2.1-6/copyright\
"
