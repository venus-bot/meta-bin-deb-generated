PACKAGES = "dconf-gsettings-backend dconf-service libdconf0"
PROVIDES = "dconf-gsettings-backend dconf-service libdconf0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/dconf-gsettings-backend_0.12.1-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/dconf-service_0.12.1-3_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/libdconf0_0.12.1-3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dconf-gsettings-backend = "dconf-gsettings-backend_0.12.1-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "4474523a5cd3b5e100549c4406613afbafdd10b6d931fe0de59c848ac24f063b"
SRC_URI[deb0.md5sum] = "32ee84627f5c9636ca636f1db1b314cd"
DEBFILENAME_dconf-service = "dconf-service_0.12.1-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "d0901b078b974e23c7c3c7eba6a648af39d743f97e7a2addf9f41e7ad3ac881f"
SRC_URI[deb1.md5sum] = "f16f6732e9fceba23957dabc7034b833"
DEBFILENAME_libdconf0 = "libdconf0_0.12.1-3_armhf.deb"
SRC_URI[deb2.sha256sum] = "b7507a5483bdf3c21433824298b9871e0aec895fcbaebc472fc89405b12275d5"
SRC_URI[deb2.md5sum] = "e824a75cff4373f325f36317e2594757"

RDEPENDS_dconf-gsettings-backend = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.18) dconf-service (>= 0.12.1-3) dconf-service (<< 0.12.1-3.1~) libdconf0 (= 0.12.1-3)"
RDEPENDS_dconf-service = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.18) libdconf0 (= 0.12.1-3)"
RDEPENDS_libdconf0 = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.18)"
DEPENDS = "libglib2.0-0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_dconf-gsettings-backend = " \
	./usr/share/doc/dconf-gsettings-backend/NEWS.gz \
	./usr/share/doc/dconf-gsettings-backend/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/gio/modules/libdconfsettings.so \
	./usr/share/doc/dconf-gsettings-backend/copyright\
"
FILES_dconf-service = " \
	./usr/lib/dconf/dconf-service \
	./usr/share/dbus-1/services/ca.desrt.dconf.service \
	./usr/share/doc/dconf-service/NEWS.gz \
	./usr/share/doc/dconf-service/copyright \
	./usr/share/doc/dconf-service/changelog.Debian.gz\
"
FILES_libdconf0 = " \
	./usr/lib/arm-linux-gnueabihf/libdconf.so.0 \
	./usr/lib/arm-linux-gnueabihf/libdconf.so.0.0.0 \
	./usr/share/doc/libdconf0/NEWS.gz \
	./usr/share/doc/libdconf0/changelog.Debian.gz \
	./usr/share/doc/libdconf0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
