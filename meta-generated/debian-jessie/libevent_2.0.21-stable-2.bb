PACKAGES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-dev_2.0.21-stable-2_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb4\
	http://ftp.de.debian.org/debian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "1879bbbec8a7dda014e14330c19c0cc70957d79d4de92c8de31bfde0c4e866b5"
SRC_URI[deb0.md5sum] = "cb53cacca51d00cb29493b62bba89471"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "46d3a78bcc5ea26f1b80e377759d1211a8e5b39b978acec101c7e70cdb71253b"
SRC_URI[deb1.md5sum] = "ab078e44e1b2f2a466506e5d8e5aef16"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.21-stable-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "7cb274588109da2d6a0d9faec51ec070cdf9a92c25fb83919c499d58a8091b4a"
SRC_URI[deb2.md5sum] = "538fd46851dec4fc51ffd611942fe96d"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb3.sha256sum] = "9cc959d664514a78fac2c023226bfa570d6f8b5e69f209f5d0fb3de3c22f7826"
SRC_URI[deb3.md5sum] = "985a6599ac3e920394f7eeaf91bd30ab"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb4.sha256sum] = "0d3de1b609f03d13c8f9ddc4efd75750ac46a72947aa4067f3dd72515cf9c521"
SRC_URI[deb4.md5sum] = "edba81a99774edb2a6a489302d1169cb"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb5.sha256sum] = "6f6347b4f82b6c824ab7a0f6a271d65b4977f6108b417348f30c141e5a99397f"
SRC_URI[deb5.md5sum] = "257f24b82e2dd3fd4245a9ce56527a79"

RDEPENDS_${PN}-2.0-5 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-core-2.0-5 = "libc6 (>= 2.17)"
RDEPENDS_${PN}-dev = "libevent-2.0-5 (= 2.0.21-stable-2) libevent-core-2.0-5 (= 2.0.21-stable-2) libevent-extra-2.0-5 (= 2.0.21-stable-2) libevent-pthreads-2.0-5 (= 2.0.21-stable-2) libevent-openssl-2.0-5 (= 2.0.21-stable-2)"
RDEPENDS_${PN}-extra-2.0-5 = "libc6 (>= 2.7) libevent-core-2.0-5 (= 2.0.21-stable-2)"
RDEPENDS_${PN}-openssl-2.0-5 = "libc6 (>= 2.4) libevent-core-2.0-5 (= 2.0.21-stable-2) libssl1.0.0 (>= 1.0.0)"
RDEPENDS_${PN}-pthreads-2.0-5 = "libc6 (>= 2.4) libevent-core-2.0-5 (= 2.0.21-stable-2)"
DEPENDS = "libssl1.0.0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libevent-2.0-5 = " \
	./usr/share/doc/libevent-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.9 \
	./usr/share/doc/libevent-2.0-5/copyright \
	./usr/share/doc/libevent-2.0-5/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5\
"
FILES_libevent-core-2.0-5 = " \
	./usr/share/doc/libevent-core-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5 \
	./usr/share/doc/libevent-core-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_core-2.0.so.5.1.9 \
	./usr/share/doc/libevent-core-2.0-5/changelog.gz\
"
FILES_${PN}-dev = " \
	./usr/share/doc/libevent-dev/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.so \
	./usr/include/event2/http.h \
	./usr/include/event2/bufferevent_ssl.h \
	./usr/include/event2/tag.h \
	./usr/lib/arm-linux-gnueabihf/libevent.a \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
	./usr/include/event2/buffer.h \
	./usr/include/event2/dns_struct.h \
	./usr/include/event2/event.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
	./usr/include/event2/event_struct.h \
	./usr/include/event2/bufferevent_struct.h \
	./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
	./usr/include/event2/tag_compat.h \
	./usr/share/doc/libevent-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
	./usr/include/evutil.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
	./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
	./usr/share/doc/libevent-dev/examples/hello-world.c \
	./usr/include/event2/dns_compat.h \
	./usr/share/doc/libevent-dev/examples/Makefile.sample \
	./usr/lib/arm-linux-gnueabihf/libevent_core.so \
	./usr/include/event2/bufferevent.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
	./usr/share/doc/libevent-dev/TODO.Debian \
	./usr/include/event.h \
	./usr/include/evrpc.h \
	./usr/include/evhttp.h \
	./usr/share/doc/libevent-dev/examples/signal-test.c \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
	./usr/include/event2/event_compat.h \
	./usr/include/event2/event-config.h \
	./usr/include/event2/rpc_struct.h \
	./usr/include/event2/dns.h \
	./usr/include/evdns.h \
	./usr/include/event2/util.h \
	./usr/lib/arm-linux-gnueabihf/libevent.so \
	./usr/share/doc/libevent-dev/examples/event-test.c \
	./usr/include/event2/http_struct.h \
	./usr/include/event2/keyvalq_struct.h \
	./usr/share/doc/libevent-dev/examples/time-test.c \
	./usr/share/doc/libevent-dev/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
	./usr/lib/arm-linux-gnueabihf/libevent_core.a \
	./usr/include/event2/bufferevent_compat.h \
	./usr/share/doc/libevent-dev/examples/http-server.c.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
	./usr/include/event2/listener.h \
	./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
	./usr/include/event2/buffer_compat.h \
	./usr/include/event2/rpc.h \
	./usr/include/event2/http_compat.h \
	./usr/include/event2/thread.h \
	./usr/include/event2/rpc_compat.h\
"
FILES_libevent-extra-2.0-5 = " \
	./usr/share/doc/libevent-extra-2.0-5/changelog.gz \
	./usr/share/doc/libevent-extra-2.0-5/copyright \
	./usr/share/doc/libevent-extra-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5.1.9 \
	./usr/lib/arm-linux-gnueabihf/libevent_extra-2.0.so.5\
"
FILES_libevent-openssl-2.0-5 = " \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.9 \
	./usr/share/doc/libevent-openssl-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
	./usr/share/doc/libevent-openssl-2.0-5/changelog.gz\
"
FILES_libevent-pthreads-2.0-5 = " \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.9 \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
	./usr/share/doc/libevent-pthreads-2.0-5/copyright \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
