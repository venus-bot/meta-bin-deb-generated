PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.12.28-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.12.28-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.12.28-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.12.28-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "642315c4684f2dddadf50042b224cc9c9bd3a1c3c79d392a21db6e0d4847bf3f"
SRC_URI[deb0.md5sum] = "ec12f508dcceb88fe9af443f10ff47e9"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.12.28-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "2aee8c64347c3d15db564c343996dfd28e949dc21f7ba5656f5ff36be885b4fb"
SRC_URI[deb1.md5sum] = "fb31f875eba8b54892f42a6e98603b83"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.12.28-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "31dfc04a99cc983faf0586fc30242cd6a5192c392ddf61588138f4a7fa8fa6d7"
SRC_URI[deb2.md5sum] = "5a92f9fc5a9f16026a90e928aab874ca"

RDEPENDS_${PN} = "adduser libapparmor1 (>= 2.8.94) libaudit1 (>= 1:2.2.1) libc6 (>= 2.28) libcap-ng0 (>= 0.7.9) libdbus-1-3 (= 1.12.28-0+deb10u1) libexpat1 (>= 2.1~beta3) libselinux1 (>= 2.0.65) libsystemd0"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.28) libsystemd0"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.12.28-0+deb10u1) pkg-config"
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
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3.19.17 \
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
