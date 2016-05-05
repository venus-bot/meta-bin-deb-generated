PACKAGES = "dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.8.20-0+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.8.20-0+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.8.20-0+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.8.20-0+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "788afaba4041b00d788787c21fe207bd438a8c735e9ce373e735400300bb8906"
SRC_URI[deb0.md5sum] = "37c13665292506d3f349b010d4ff47cf"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.8.20-0+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "9e7b0853b0791dcf70e1939c1db27e4112fb8e4458b895ea23dbb42bdb5d4792"
SRC_URI[deb1.md5sum] = "1fa88e2db762e0b1b01d0559aa193d06"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.8.20-0+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "f7316b39ea75e14910ab3e842d7ca0954126cb5347d8c890bae6cff8980293e4"
SRC_URI[deb2.md5sum] = "517ee08dfff04f9760b56dc61c32af68"

RDEPENDS_${PN} = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.17) libcap-ng0 libdbus-1-3 (>= 1.7.6) libexpat1 (>= 2.0.1) libselinux1 (>= 2.0.65) libsystemd0 adduser lsb-base (>= 3.2-14)"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.17)"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.8.20-0+deb8u1) pkg-config"
DEPENDS = "libsystemd0 adduser libselinux1 lsb-base libcap-ng0 libaudit1 libc6 libexpat1 pkg-config"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/dbus/NEWS.gz \
	./etc/default/dbus \
	./lib/systemd/system/dbus.target.wants/dbus.socket \
	./usr/share/man/man1/dbus-monitor.1.gz \
	./usr/share/man/man1/dbus-run-session.1.gz \
	./usr/bin/dbus-run-session \
	./usr/share/doc/dbus/copyright \
	./usr/bin/dbus-uuidgen \
	./usr/share/doc/dbus/changelog.Debian.gz \
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
	./lib/systemd/system/dbus.service\
"
FILES_libdbus-1-3 = " \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
	./usr/share/doc/libdbus-1-3/NEWS.gz \
	./usr/share/doc/libdbus-1-3/copyright \
	./usr/share/doc/libdbus-1-3/AUTHORS.gz \
	./usr/share/lintian/overrides/libdbus-1-3 \
	./usr/share/doc/libdbus-1-3/README.gz \
	./usr/share/doc/libdbus-1-3/changelog.Debian.gz \
	./usr/share/doc/libdbus-1-3/changelog.gz \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3.8.13\
"
FILES_libdbus-1-dev = " \
	./usr/include/dbus-1.0/dbus/dbus-memory.h \
	./usr/lib/arm-linux-gnueabihf/libdbus-1.so \
	./usr/lib/arm-linux-gnueabihf/dbus-1.0/include/dbus/dbus-arch-deps.h \
	./usr/include/dbus-1.0/dbus/dbus-bus.h \
	./usr/include/dbus-1.0/dbus/dbus-pending-call.h \
	./usr/share/doc/libdbus-1-dev/changelog.Debian.gz \
	./usr/include/dbus-1.0/dbus/dbus-misc.h \
	./usr/include/dbus-1.0/dbus/dbus-protocol.h \
	./usr/include/dbus-1.0/dbus/dbus.h \
	./usr/share/doc/libdbus-1-dev/AUTHORS.gz \
	./usr/share/doc/libdbus-1-dev/README.gz \
	./usr/include/dbus-1.0/dbus/dbus-server.h \
	./usr/lib/arm-linux-gnueabihf/libdbus-1.a \
	./usr/share/doc/libdbus-1-dev/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/dbus-1.pc \
	./usr/include/dbus-1.0/dbus/dbus-signature.h \
	./usr/share/lintian/overrides/libdbus-1-dev \
	./usr/include/dbus-1.0/dbus/dbus-connection.h \
	./usr/include/dbus-1.0/dbus/dbus-shared.h \
	./usr/share/doc/libdbus-1-dev/copyright \
	./usr/include/dbus-1.0/dbus/dbus-errors.h \
	./usr/include/dbus-1.0/dbus/dbus-macros.h \
	./usr/include/dbus-1.0/dbus/dbus-types.h \
	./usr/include/dbus-1.0/dbus/dbus-threads.h \
	./usr/include/dbus-1.0/dbus/dbus-address.h \
	./usr/include/dbus-1.0/dbus/dbus-syntax.h \
	./usr/include/dbus-1.0/dbus/dbus-message.h \
	./usr/share/doc/libdbus-1-dev/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
