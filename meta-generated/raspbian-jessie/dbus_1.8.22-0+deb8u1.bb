PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.8.22-0+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "88194ab89f91142230dcfa9124ebaaed310dd7e5eaec5af0e4854cbd19494d28"
SRC_URI[deb0.md5sum] = "7bcd49bcb6aafe08eac9a4c9df04840e"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ee94132643c78f2938ef859ec3c315a7b79f66526c52fa920a782a25d78ec8f1"
SRC_URI[deb1.md5sum] = "266f7b47ac514e96ac6d19a59d77c123"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.8.22-0+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "93242794d41b7f8688f35a8704175f9b84b5174bd8a71320e1cc5259fe3f2149"
SRC_URI[deb2.md5sum] = "f6ac491479c35ed4f3f7f71c589f0b0e"

RDEPENDS_${PN} = "libaudit1 (>= 1:2.2.1) libc6 (>= 2.17) libcap-ng0 libdbus-1-3 (>= 1.7.6) libexpat1 (>= 2.0.1) libselinux1 (>= 2.0.65) libsystemd0 adduser lsb-base (>= 3.2-14)"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.17)"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.8.22-0+deb8u1) pkg-config"
DEPENDS = "libexpat1 adduser libaudit1 lsb-base pkg-config libc6 libcap-ng0 libselinux1 libsystemd0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/share/man/man1/dbus-run-session.1.gz \
    ./usr/bin/dbus-cleanup-sockets \
    ./usr/bin/dbus-uuidgen \
    ./usr/share/doc/dbus/README.Debian \
    ./lib/systemd/system/dbus.service \
    ./lib/systemd/system/sockets.target.wants/dbus.socket \
    ./usr/share/doc/dbus/changelog.Debian.gz \
    ./usr/share/lintian/overrides/dbus \
    ./usr/share/doc/dbus/copyright \
    ./etc/init.d/dbus \
    ./usr/bin/dbus-run-session \
    ./usr/bin/dbus-send \
    ./usr/lib/dbus-1.0/dbus-daemon-launch-helper \
    ./etc/default/dbus \
    ./usr/bin/dbus-daemon \
    ./lib/systemd/system/dbus.socket \
    ./usr/share/doc/dbus/NEWS.gz \
    ./usr/share/man/man1/dbus-uuidgen.1.gz \
    ./usr/bin/dbus-monitor \
    ./usr/share/doc/dbus/changelog.gz \
    ./usr/share/bug/dbus/control \
    ./usr/share/doc/dbus/README.gz \
    ./etc/dbus-1/system.conf \
    ./lib/systemd/system/multi-user.target.wants/dbus.service \
    ./etc/dbus-1/session.conf \
    ./lib/systemd/system/dbus.target.wants/dbus.socket \
    ./usr/share/man/man1/dbus-monitor.1.gz \
    ./usr/share/man/man1/dbus-send.1.gz \
    ./usr/share/man/man1/dbus-daemon.1.gz \
    ./usr/share/man/man1/dbus-cleanup-sockets.1.gz \
    ./usr/share/doc/dbus/AUTHORS.gz\
"
FILES_libdbus-1-3 = " \
    ./usr/share/doc/libdbus-1-3/AUTHORS.gz \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3.8.14 \
    ./usr/share/doc/libdbus-1-3/NEWS.gz \
    ./usr/share/doc/libdbus-1-3/changelog.Debian.gz \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
    ./usr/share/doc/libdbus-1-3/README.gz \
    ./usr/share/doc/libdbus-1-3/changelog.gz \
    ./usr/share/lintian/overrides/libdbus-1-3 \
    ./usr/share/doc/libdbus-1-3/copyright\
"
FILES_libdbus-1-dev = " \
    ./usr/share/doc/libdbus-1-dev/copyright \
    ./usr/include/dbus-1.0/dbus/dbus-signature.h \
    ./usr/share/doc/libdbus-1-dev/NEWS.gz \
    ./usr/include/dbus-1.0/dbus/dbus-macros.h \
    ./usr/include/dbus-1.0/dbus/dbus-protocol.h \
    ./usr/share/lintian/overrides/libdbus-1-dev \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/dbus-1.pc \
    ./usr/include/dbus-1.0/dbus/dbus.h \
    ./usr/lib/arm-linux-gnueabihf/dbus-1.0/include/dbus/dbus-arch-deps.h \
    ./usr/lib/arm-linux-gnueabihf/libdbus-1.a \
    ./usr/share/doc/libdbus-1-dev/changelog.gz \
    ./usr/include/dbus-1.0/dbus/dbus-threads.h \
    ./usr/include/dbus-1.0/dbus/dbus-shared.h \
    ./usr/include/dbus-1.0/dbus/dbus-address.h \
    ./usr/include/dbus-1.0/dbus/dbus-misc.h \
    ./usr/include/dbus-1.0/dbus/dbus-connection.h \
    ./usr/include/dbus-1.0/dbus/dbus-syntax.h \
    ./usr/include/dbus-1.0/dbus/dbus-bus.h \
    ./usr/include/dbus-1.0/dbus/dbus-server.h \
    ./usr/include/dbus-1.0/dbus/dbus-memory.h \
    ./usr/share/doc/libdbus-1-dev/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libdbus-1.so \
    ./usr/include/dbus-1.0/dbus/dbus-errors.h \
    ./usr/share/doc/libdbus-1-dev/AUTHORS.gz \
    ./usr/include/dbus-1.0/dbus/dbus-types.h \
    ./usr/include/dbus-1.0/dbus/dbus-pending-call.h \
    ./usr/share/doc/libdbus-1-dev/README.gz \
    ./usr/include/dbus-1.0/dbus/dbus-message.h\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
