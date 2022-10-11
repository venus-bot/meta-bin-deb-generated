PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.12.24-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.12.24-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.12.24-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.12.24-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b435c76d44d834390826d532bb04202ffa2236d9e407dc78aa3fe73e021c782f"
SRC_URI[deb0.md5sum] = "a9163cb05dcd06b730a97199832f1751"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.12.24-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "104e213524732f5d0a86d72e68e78c0f04aeb2e19033ec716591b9d516d5e9de"
SRC_URI[deb1.md5sum] = "931dbe79724e485ddc2d67c73a70b7b3"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.12.24-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "121ac7901aa0708eb4240c7b20f9f9a597b4f528c24d528780e7de7884243fe5"
SRC_URI[deb2.md5sum] = "4f0882b04b7b9d0d14fcc9241668a2e9"

RDEPENDS_${PN} = "adduser libapparmor1 (>= 2.8.94) libaudit1 (>= 1:2.2.1) libc6 (>= 2.28) libcap-ng0 (>= 0.7.9) libdbus-1-3 (= 1.12.24-0+deb10u1) libexpat1 (>= 2.1~beta3) libselinux1 (>= 2.0.65) libsystemd0"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.28) libsystemd0"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.12.24-0+deb10u1) pkg-config"
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
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3.19.15 \
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
