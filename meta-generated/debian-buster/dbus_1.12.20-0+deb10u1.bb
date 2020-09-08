PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dbus/dbus_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/dbus/libdbus-1-3_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/d/dbus/libdbus-1-dev_1.12.20-0+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b98f63ae3615dd26f8da5caa9a34d9bd65a838b85e18288908f5f218a6995077"
SRC_URI[deb0.md5sum] = "c01fc10ab0c92b8344ec4e68953f2f06"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "3457e8bf06139c0892c78f4d727b39c3ee90f918b56a9eb765f07333c77b3cf0"
SRC_URI[deb1.md5sum] = "7a2ea0a2f824e0c177506eb70b60279e"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.12.20-0+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "fd09c95db3ee65aface4877c86d74367c7ff290d5ce8c8c388d90e65a8242055"
SRC_URI[deb2.md5sum] = "d45b35b7d4880237322b2b8637ffcb61"

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
