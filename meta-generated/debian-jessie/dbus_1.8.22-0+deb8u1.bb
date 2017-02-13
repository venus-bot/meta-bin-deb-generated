PACKAGES = "dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dbus/dbus_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/dbus/libdbus-1-3_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/d/dbus/libdbus-1-dev_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "6607a348a9c4d2a4ee49976634869179b80bc1ad6685aba00794fdc4562dfd2c"
SRC_URI[deb0.md5sum] = "d920c0841cdb2e6712b5e2f966192a8e"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "e49a3777758b56a78a65f7500912fbe1255ef08a86b5d1ce6a575c85b04f1d25"
SRC_URI[deb1.md5sum] = "53cb9466068f9a49b1b85a076b270cc8"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "768564d47f9d181f3f43e4785ad09b316ecf650d8cf35d2c65b4905b79ba1e73"
SRC_URI[deb2.md5sum] = "295dcaf0fbb0c66d99663da53426cd33"

RDEPENDS_${PN} = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.17) libcap-ng0 libdbus-1-3 (>= 1.7.6) libexpat1 (>= 2.0.1) libselinux1 (>= 2.0.65) libsystemd0 adduser lsb-base (>= 3.2-14)"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.17)"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.8.22-0+deb8u1) pkg-config"
DEPENDS = "libsystemd0 adduser libselinux1 lsb-base libcap-ng0 libaudit1 libc6 libexpat1 pkg-config"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/dbus/NEWS.gz \
	./usr/share/doc/dbus/changelog.Debian.gz \
	./lib/systemd/system/dbus.target.wants/dbus.socket \
	./usr/share/man/man1/dbus-monitor.1.gz \
	./usr/share/man/man1/dbus-run-session.1.gz \
	./lib/systemd/system/dbus.service \
	./usr/share/doc/dbus/copyright \
	./usr/bin/dbus-uuidgen \
	./etc/default/dbus \
	./usr/bin/dbus-cleanup-sockets \
	./usr/share/bug/dbus/control \
	./usr/share/doc/dbus/AUTHORS.gz \
	./usr/share/man/man1/dbus-uuidgen.1.gz \
	./etc/init.d/dbus \
	./usr/lib/dbus-1.0/dbus-daemon-launch-helper \
	./usr/share/doc/dbus/changelog.gz \
	./usr/share/man/man1/dbus-daemon.1.gz \
	./lib/systemd/system/sockets.target.wants/dbus.socket \
	./etc/dbus-1/session.conf \
	./lib/systemd/system/multi-user.target.wants/dbus.service \
	./usr/share/doc/dbus/README.Debian \
	./usr/bin/dbus-monitor \
	./usr/share/man/man1/dbus-send.1.gz \
	./usr/bin/dbus-daemon \
	./usr/share/man/man1/dbus-cleanup-sockets.1.gz \
	./etc/dbus-1/system.conf \
	./lib/systemd/system/dbus.socket \
	./usr/share/doc/dbus/README.gz \
	./usr/bin/dbus-send \
	./usr/share/lintian/overrides/dbus \
	./usr/bin/dbus-run-session\
"
FILES_libdbus-1-3 = " \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
	./usr/share/doc/libdbus-1-3/NEWS.gz \
	./usr/share/doc/libdbus-1-3/copyright \
	./usr/share/doc/libdbus-1-3/AUTHORS.gz \
	./usr/share/lintian/overrides/libdbus-1-3 \
	./usr/share/doc/libdbus-1-3/README.gz \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3.8.14 \
	./usr/share/doc/libdbus-1-3/changelog.Debian.gz \
	./usr/share/doc/libdbus-1-3/changelog.gz\
"
FILES_libdbus-1-dev = " \
	./usr/include/dbus-1.0/dbus/dbus-memory.h \
	./usr/lib/arm-linux-gnueabihf/libdbus-1.so \
	./usr/lib/arm-linux-gnueabihf/dbus-1.0/include/dbus/dbus-arch-deps.h \
	./usr/include/dbus-1.0/dbus/dbus-bus.h \
	./usr/include/dbus-1.0/dbus/dbus-pending-call.h \
	./usr/share/doc/libdbus-1-dev/changelog.Debian.gz \
	./usr/include/dbus-1.0/dbus/dbus-misc.h \
	./usr/lib/arm-linux-gnueabihf/libdbus-1.a \
	./usr/include/dbus-1.0/dbus/dbus.h \
	./usr/share/doc/libdbus-1-dev/AUTHORS.gz \
	./usr/share/doc/libdbus-1-dev/README.gz \
	./usr/include/dbus-1.0/dbus/dbus-server.h \
	./usr/include/dbus-1.0/dbus/dbus-protocol.h \
	./usr/share/doc/libdbus-1-dev/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/dbus-1.pc \
	./usr/include/dbus-1.0/dbus/dbus-signature.h \
	./usr/share/lintian/overrides/libdbus-1-dev \
	./usr/include/dbus-1.0/dbus/dbus-connection.h \
	./usr/include/dbus-1.0/dbus/dbus-shared.h \
	./usr/include/dbus-1.0/dbus/dbus-errors.h \
	./usr/include/dbus-1.0/dbus/dbus-address.h \
	./usr/include/dbus-1.0/dbus/dbus-macros.h \
	./usr/include/dbus-1.0/dbus/dbus-types.h \
	./usr/include/dbus-1.0/dbus/dbus-threads.h \
	./usr/share/doc/libdbus-1-dev/copyright \
	./usr/include/dbus-1.0/dbus/dbus-syntax.h \
	./usr/include/dbus-1.0/dbus/dbus-message.h \
	./usr/share/doc/libdbus-1-dev/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
