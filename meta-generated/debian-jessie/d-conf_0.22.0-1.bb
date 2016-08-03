PACKAGES = "dconf-gsettings-backend dconf-service libdconf1"
PROVIDES = "dconf-gsettings-backend dconf-service libdconf1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/d-conf/dconf-gsettings-backend_0.22.0-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/d-conf/dconf-service_0.22.0-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/d/d-conf/libdconf1_0.22.0-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dconf-gsettings-backend = "dconf-gsettings-backend_0.22.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "bd30bc3e473f06098a10a6c13d8c8d2d975c950a91e44e2b8a6ee5f5146c917d"
SRC_URI[deb0.md5sum] = "d5ecc79dfffe323a3f6899c28a80000a"
DEBFILENAME_dconf-service = "dconf-service_0.22.0-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "4327c9eec0e29ed66d2d539dcf3ebf31cf542d92ed0e6a9b22ddc494ed84a59b"
SRC_URI[deb1.md5sum] = "68ed981cd6b6f3c8fd8384fa0e5ec9c1"
DEBFILENAME_libdconf1 = "libdconf1_0.22.0-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "05c49ee63d4757aae976e95a71f606bb95e1c7fd2f78103f02d3f9573094313e"
SRC_URI[deb2.md5sum] = "b355763328bec13cbbd6591da97c24d2"

RDEPENDS_dconf-gsettings-backend = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.1) dconf-service (>= 0.22.0-1) dconf-service (<< 0.22.0-1.1~) libdconf1 (= 0.22.0-1)"
RDEPENDS_dconf-service = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.1) libdconf1 (= 0.22.0-1)"
RDEPENDS_libdconf1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.1)"
DEPENDS = "libglib2.0-0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_dconf-gsettings-backend = " \
	./usr/share/doc/dconf-gsettings-backend/NEWS.Debian.gz \
	./usr/share/doc/dconf-gsettings-backend/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/gio/modules/libdconfsettings.so \
	./usr/share/doc/dconf-gsettings-backend/README \
	./usr/share/doc/dconf-gsettings-backend/NEWS.gz \
	./usr/share/doc/dconf-gsettings-backend/copyright\
"
FILES_dconf-service = " \
	./usr/share/dbus-1/services/ca.desrt.dconf.service \
	./usr/share/doc/dconf-service/copyright \
	./usr/share/doc/dconf-service/NEWS.Debian.gz \
	./usr/lib/dconf/dconf-service \
	./usr/share/dbus-1/services/ca.desrt.dconf-editor.service \
	./usr/share/doc/dconf-service/README \
	./usr/share/doc/dconf-service/NEWS.gz \
	./usr/share/man/man1/dconf-service.1.gz \
	./usr/share/doc/dconf-service/changelog.Debian.gz\
"
FILES_libdconf1 = " \
	./usr/share/doc/libdconf1/copyright \
	./usr/lib/arm-linux-gnueabihf/libdconf.so.1.0.0 \
	./usr/share/doc/libdconf1/NEWS.gz \
	./usr/share/doc/libdconf1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libdconf.so.1 \
	./usr/share/doc/libdconf1/README \
	./usr/share/doc/libdconf1/NEWS.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
