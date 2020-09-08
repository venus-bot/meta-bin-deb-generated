PACKAGES = "${PN} dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.8.22-0+deb8u3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.8.22-0+deb8u3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.8.22-0+deb8u3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.8.22-0+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "e5853f882244871c6fa19abfb99c5105f65c88a6ee4c3602d541b64c1a3d9ec0"
SRC_URI[deb0.md5sum] = "90ce3e0dda6d185c63b060b43574fc43"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.8.22-0+deb8u3_armhf.deb"
SRC_URI[deb1.sha256sum] = "bcf70829ac83a012264f78d113e6e04e66e187114df4fe8cdf5f8d1eaaed53ac"
SRC_URI[deb1.md5sum] = "ab3c8b832f251b4fef76e8ce69d1f750"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.8.22-0+deb8u3_armhf.deb"
SRC_URI[deb2.sha256sum] = "f9589c617d5bbd0858114c02c897ba0e1fd1c85ad03cc70d079d8ead64cd74c1"
SRC_URI[deb2.md5sum] = "bd40dce16f4f5825c2075ad947a34403"

RDEPENDS_${PN} = "adduser libaudit1 (>= 1:2.2.1) libc6 (>= 2.17) libcap-ng0 libdbus-1-3 (>= 1.7.6) libexpat1 (>= 2.0.1) libselinux1 (>= 2.0.65) libsystemd0 lsb-base (>= 3.2-14)"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.17) multiarch-support"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.8.22-0+deb8u3) pkg-config"
DEPENDS = "adduser libaudit1 libc6 libcap-ng0 libexpat1 libselinux1 libsystemd0 lsb-base multiarch-support pkg-config"


inherit deb_group

FILES_${PN} = " \
    ./etc/dbus-1/session.conf \
    ./etc/dbus-1/system.conf \
    ./etc/default/dbus \
    ./etc/init.d/dbus \
    ./lib/systemd/system/dbus.service \
    ./lib/systemd/system/dbus.socket \
    ./lib/systemd/system/dbus.target.wants/dbus.socket \
    ./lib/systemd/system/multi-user.target.wants/dbus.service \
    ./lib/systemd/system/sockets.target.wants/dbus.socket \
    ./usr/bin/dbus-cleanup-sockets \
    ./usr/bin/dbus-daemon \
    ./usr/bin/dbus-monitor \
    ./usr/bin/dbus-run-session \
    ./usr/bin/dbus-send \
    ./usr/bin/dbus-uuidgen \
    ./usr/lib/dbus-1.0/dbus-daemon-launch-helper \
    ./usr/share/bug/dbus/control \
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
    ./usr/share/man/man1/dbus-uuidgen.1.gz\
"
FILES_libdbus-1-3 = " \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
    ./lib/arm-linux-gnueabihf/libdbus-1.so.3.8.14 \
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
    ./usr/share/lintian/overrides/libdbus-1-dev\
"
