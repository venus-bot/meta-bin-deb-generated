PACKAGES = "dbus libdbus-1-3 libdbus-1-dev"
PROVIDES = "dbus libdbus-1-3 libdbus-1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/dbus_1.6.8-1+deb7u6_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-3_1.6.8-1+deb7u6_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dbus/libdbus-1-dev_1.6.8-1+deb7u6_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dbus = "dbus_1.6.8-1+deb7u6_armhf.deb"
SRC_URI[deb0.sha256sum] = "872b8c95ea14afd1b2da20dc04b6facf30afce117fd66c2129e076f74e84046f"
SRC_URI[deb0.md5sum] = "a610391d9fa72f53235db583fe3bc987"
DEBFILENAME_libdbus-1-3 = "libdbus-1-3_1.6.8-1+deb7u6_armhf.deb"
SRC_URI[deb1.sha256sum] = "ac1235afc53077a16e032bb8f467acd460c61a66fc3dd8f5e27a5421ab9c397e"
SRC_URI[deb1.md5sum] = "106c62042dac3d1139bb0749914c28a2"
DEBFILENAME_libdbus-1-dev = "libdbus-1-dev_1.6.8-1+deb7u6_armhf.deb"
SRC_URI[deb2.sha256sum] = "6bcd3181dfc8afc20df59f4cc4c02b0eeaf1357e37c77ef701e0a6e2c9b3b07b"
SRC_URI[deb2.md5sum] = "0721d6a1d2109ff37a24ee7f06f27e02"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.0.2) libexpat1 (>= 2.0.1) libselinux1 (>= 1.32) libsystemd-login0 (>= 31) adduser lsb-base (>= 3.2-14)"
RDEPENDS_lib${PN}-1-3 = "libc6 (>= 2.13-28)"
RDEPENDS_lib${PN}-1-dev = "libdbus-1-3 (= 1.6.8-1+deb7u6) pkg-config"
DEPENDS = "pkg-config adduser libselinux1 lsb-base libc6 libexpat1 libsystemd-login0"


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
	./etc/default/dbus \
	./lib/systemd/system/dbus.service \
	./usr/share/doc/dbus/copyright \
	./usr/bin/dbus-uuidgen \
	./usr/bin/dbus-cleanup-sockets \
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
	./usr/share/lintian/overrides/dbus\
"
FILES_libdbus-1-3 = " \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3.7.2 \
	./lib/arm-linux-gnueabihf/libdbus-1.so.3 \
	./usr/share/doc/libdbus-1-3/NEWS.gz \
	./usr/share/doc/libdbus-1-3/copyright \
	./usr/share/doc/libdbus-1-3/AUTHORS.gz \
	./usr/share/lintian/overrides/libdbus-1-3 \
	./usr/share/doc/libdbus-1-3/README.gz \
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
