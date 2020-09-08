PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "02ac0f0d5752f610fb5a3780a9553bb4fd9bb2e7c4a2b18a009e040c1fc84e21"
SRC_URI[deb0.md5sum] = "949bf2be04492553ab99e9a0a8f9c132"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "a68dec0d2d9370962629b375a029ef481b0e74b8cd4a5c97e625924fe5996f5c"
SRC_URI[deb1.md5sum] = "d3fc59193874c2a332e7f0b2b63660cf"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "8f62f6f8073346fc85beb51a13154eb7e5c93333660e7c63999757e0af04da3d"
SRC_URI[deb2.md5sum] = "3924e0e6f2ab3cf1316a15e1cab87b98"

RDEPENDS_${PN} = "adduser libapparmor1 (>= 2.8.94) libaudit1 (>= 1:2.2.1) libc6 (>= 2.28) libcap-ng0 (>= 0.7.9) libdbus-1-3 (= 1.12.20-0+deb10u1) libexpat1 (>= 2.1~beta3) libselinux1 (>= 2.0.65) libsystemd0"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.28) libsystemd0"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.12.20-0+deb10u1) pkg-config"
DEPENDS = "adduser libapparmor1 libaudit1 libc6 libcap-ng0 libexpat1 libselinux1 libsystemd0 pkg-config"


inherit deb_group

FILES_${PN} = " \
    ./etc/default/dbus \
    ./etc/init.d/dbus \
    ./lib/systemd/system/dbus.service \
    ./lib/systemd/system/dbus.socket \
    ./lib/systemd/system/multi-user.target.wants/dbus.service \
    ./lib/systemd/system/sockets.target.wants/dbus.socket \
    ./usr/bin/dbus-cleanup-sockets \
    ./usr/bin/dbus-daemon \
    ./usr/bin/dbus-monitor \
    ./usr/bin/dbus-run-session \
    ./usr/bin/dbus-send \
    ./usr/bin/dbus-update-activation-environment \
    ./usr/bin/dbus-uuidgen \
    ./usr/lib/dbus-1.0/dbus-daemon-launch-helper \
    ./usr/lib/sysusers.d/dbus.conf \
    ./usr/lib/tmpfiles.d/dbus.conf \
    ./usr/share/bug/dbus/control \
    ./usr/share/dbus-1/session.conf \
    ./usr/share/dbus-1/system.conf \
    ./usr/share/doc/dbus/AUTHORS.gz \
    ./usr/share/doc/dbus/NEWS.gz \
    ./usr/share/doc/dbus/README.Debian \
    ./usr/share/doc/dbus/README.gz \
    ./usr/share/doc/dbus/changelog.Debian.gz \
    ./usr/share/doc/dbus/changelog.gz \
    ./usr/share/doc/dbus/copyright \
    ./usr/share/lintian/overrides/dbus \
    ./usr/share/man/man1/dbus-cleanup-sockets.1.gz \
    ./usr/share/man/man1/dbus-daemon.1.gz \
    ./usr/share/man/man1/dbus-monitor.1.gz \
    ./usr/share/man/man1/dbus-run-session.1.gz \
    ./usr/share/man/man1/dbus-send.1.gz \
    ./usr/share/man/man1/dbus-update-activation-environment.1.gz \
    ./usr/share/man/man1/dbus-uuidgen.1.gz\
"
FILES_libdbus-1-3 = " \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3.19.13 \
    ./usr/share/doc/libdbus-1-3/AUTHORS.gz \
    ./usr/share/doc/libdbus-1-3/NEWS.gz \
    ./usr/share/doc/libdbus-1-3/README.gz \
    ./usr/share/doc/libdbus-1-3/changelog.Debian.gz \
    ./usr/share/doc/libdbus-1-3/changelog.gz \
    ./usr/share/doc/libdbus-1-3/copyright \
    ./usr/share/lintian/overrides/libdbus-1-3\
"
FILES_libdbus-1-dev = " \
    ./usr/include/dbus-1.0/dbus/dbus-address.h \
    ./usr/include/dbus-1.0/dbus/dbus-bus.h \
    ./usr/include/dbus-1.0/dbus/dbus-connection.h \
    ./usr/include/dbus-1.0/dbus/dbus-errors.h \
    ./usr/include/dbus-1.0/dbus/dbus-macros.h \
    ./usr/include/dbus-1.0/dbus/dbus-memory.h \
    ./usr/include/dbus-1.0/dbus/dbus-message.h \
    ./usr/include/dbus-1.0/dbus/dbus-misc.h \
    ./usr/include/dbus-1.0/dbus/dbus-pending-call.h \
    ./usr/include/dbus-1.0/dbus/dbus-protocol.h \
    ./usr/include/dbus-1.0/dbus/dbus-server.h \
    ./usr/include/dbus-1.0/dbus/dbus-shared.h \
    ./usr/include/dbus-1.0/dbus/dbus-signature.h \
    ./usr/include/dbus-1.0/dbus/dbus-syntax.h \
    ./usr/include/dbus-1.0/dbus/dbus-threads.h \
    ./usr/include/dbus-1.0/dbus/dbus-types.h \
    ./usr/include/dbus-1.0/dbus/dbus.h \
    ./usr/lib/arm-linux-gnueabihf/cmake/DBus1/DBus1Config.cmake \
    ./usr/lib/arm-linux-gnueabihf/cmake/DBus1/DBus1ConfigVersion.cmake \
    ./usr/lib/arm-linux-gnueabihf/dbus-1.0/include/dbus/dbus-arch-deps.h \
    ./usr/lib/arm-linux-gnueabihf/libdbus-1.a \
    ./usr/lib/arm-linux-gnueabihf/libdbus-1.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/dbus-1.pc \
    ./usr/share/doc/libdbus-1-dev/AUTHORS.gz \
    ./usr/share/doc/libdbus-1-dev/NEWS.gz \
    ./usr/share/doc/libdbus-1-dev/README.gz \
    ./usr/share/doc/libdbus-1-dev/changelog.Debian.gz \
    ./usr/share/doc/libdbus-1-dev/changelog.gz \
    ./usr/share/doc/libdbus-1-dev/copyright \
    ./usr/share/lintian/overrides/libdbus-1-dev \
    ./usr/share/xml/dbus-1/busconfig.dtd \
    ./usr/share/xml/dbus-1/introspect.dtd\
"
