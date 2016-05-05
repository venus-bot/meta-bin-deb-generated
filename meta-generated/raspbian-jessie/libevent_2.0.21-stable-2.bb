PACKAGES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
PROVIDES = "libevent-2.0-5 libevent-core-2.0-5 libevent-dev libevent-extra-2.0-5 libevent-openssl-2.0-5 libevent-pthreads-2.0-5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-core-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-dev_2.0.21-stable-2_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-extra-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-openssl-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb4\
	http://archive.raspbian.org/raspbian/pool/main/libe/libevent/libevent-pthreads-2.0-5_2.0.21-stable-2_armhf.deb;unpack=0;name=deb5\
"
DEBFILENAME_libevent-2.0-5 = "libevent-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "a0d03cbb5a1bbe92c15534c538e8db7e57f29ad5ff59ca7dc8caf8c234eb1359"
SRC_URI[deb0.md5sum] = "f97b5fbe4abccd93ebbce2d140af01fd"
DEBFILENAME_libevent-core-2.0-5 = "libevent-core-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "bd3c125ad7b1df4f1b1176447d87244f36379ed9a14d731f50f8ca98365bc986"
SRC_URI[deb1.md5sum] = "8a549a0c19365fbb49e55521a69123dc"
DEBFILENAME_libevent-dev = "libevent-dev_2.0.21-stable-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "f62882341558370838cc3167ef2eb6e42a69e03b5601703c2506e3a243031a9d"
SRC_URI[deb2.md5sum] = "4e47a6885175ea106fa989d5875e8863"
DEBFILENAME_libevent-extra-2.0-5 = "libevent-extra-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb3.sha256sum] = "08addb48bb5490423f3ca690f059c1c205882199ee2611992c81fbeeffc4fd7c"
SRC_URI[deb3.md5sum] = "14bc1e6cb30c929252201e2f18418fb4"
DEBFILENAME_libevent-openssl-2.0-5 = "libevent-openssl-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb4.sha256sum] = "808f2007588787b26f51c3a0d7f329ffb32b03afb49cc1f2a767f78edd6b62d0"
SRC_URI[deb4.md5sum] = "13d03b60dc7dc3b1261498742430aa1b"
DEBFILENAME_libevent-pthreads-2.0-5 = "libevent-pthreads-2.0-5_2.0.21-stable-2_armhf.deb"
SRC_URI[deb5.sha256sum] = "473cadbaf2ffff9a3bbfec97b38235047ef64cb69e77c395a3f3258f8d267319"
SRC_URI[deb5.md5sum] = "682848abaec5527db6f868d7b240e36e"

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
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5 \
	./usr/share/doc/libevent-2.0-5/changelog.gz \
	./usr/share/doc/libevent-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent-2.0.so.5.1.9\
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
	./usr/share/doc/libevent-dev/examples/event-test.c \
	./usr/include/event2/util.h \
	./usr/include/event2/dns_struct.h \
	./usr/include/event2/event.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.a \
	./usr/lib/arm-linux-gnueabihf/libevent.so \
	./usr/include/event2/event_struct.h \
	./usr/include/event2/dns_compat.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.a \
	./usr/include/event2/tag_compat.h \
	./usr/share/doc/libevent-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads.a \
	./usr/include/evutil.h \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl.so \
	./usr/share/doc/libevent-dev/examples/le-proxy.c.gz \
	./usr/include/evhttp.h \
	./usr/share/doc/libevent-dev/examples/Makefile.sample \
	./usr/lib/arm-linux-gnueabihf/libevent_core.so \
	./usr/include/event2/bufferevent.h \
	./usr/lib/arm-linux-gnueabihf/libevent_extra.so \
	./usr/share/doc/libevent-dev/TODO.Debian \
	./usr/include/event.h \
	./usr/include/evrpc.h \
	./usr/share/doc/libevent-dev/examples/hello-world.c \
	./usr/share/doc/libevent-dev/changelog.Debian.gz \
	./usr/share/doc/libevent-dev/examples/signal-test.c \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_pthreads.pc \
	./usr/include/event2/event_compat.h \
	./usr/include/event2/event-config.h \
	./usr/include/event2/rpc_struct.h \
	./usr/include/event2/rpc_compat.h \
	./usr/include/evdns.h \
	./usr/include/event2/rpc.h \
	./usr/share/doc/libevent-dev/examples/http-server.c.gz \
	./usr/include/event2/http_struct.h \
	./usr/include/event2/keyvalq_struct.h \
	./usr/share/doc/libevent-dev/examples/time-test.c \
	./usr/share/doc/libevent-dev/examples/dns-example.c.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent_openssl.pc \
	./usr/lib/arm-linux-gnueabihf/libevent_core.a \
	./usr/include/event2/bufferevent_compat.h \
	./usr/include/event2/buffer.h \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/libevent.pc \
	./usr/include/event2/listener.h \
	./usr/share/doc/libevent-dev/whatsnew-2.0.txt.gz \
	./usr/include/event2/buffer_compat.h \
	./usr/include/event2/bufferevent_struct.h \
	./usr/include/event2/dns.h \
	./usr/include/event2/thread.h \
	./usr/include/event2/http_compat.h\
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
	./usr/share/doc/libevent-openssl-2.0-5/changelog.gz \
	./usr/share/doc/libevent-openssl-2.0-5/copyright \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5 \
	./usr/lib/arm-linux-gnueabihf/libevent_openssl-2.0.so.5.1.9\
"
FILES_libevent-pthreads-2.0-5 = " \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5.1.9 \
	./usr/lib/arm-linux-gnueabihf/libevent_pthreads-2.0.so.5 \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.Debian.gz \
	./usr/share/doc/libevent-pthreads-2.0-5/copyright \
	./usr/share/doc/libevent-pthreads-2.0-5/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
