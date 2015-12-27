PACKAGES = "libpopt0"
PROVIDES = "libpopt0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/popt/libpopt0_1.16-7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpopt0 = "libpopt0_1.16-7_armhf.deb"
SRC_URI[deb0.sha256sum] = "644825ae413413419a85b1d592de03ce678f7b566d964fa15d4b2a415267562d"
SRC_URI[deb0.md5sum] = "81ac0d13f294b413231a91c2f9fa0647"

RDEPENDS_lib${PN}0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpopt0 = " \
	./usr/share/locale/gl/LC_MESSAGES/popt.mo \
	./usr/share/doc/libpopt0/copyright \
	./usr/share/locale/sl/LC_MESSAGES/popt.mo \
	./usr/share/locale/it/LC_MESSAGES/popt.mo \
	./usr/share/locale/ga/LC_MESSAGES/popt.mo \
	./usr/share/locale/fi/LC_MESSAGES/popt.mo \
	./usr/share/locale/th/LC_MESSAGES/popt.mo \
	./usr/share/locale/ja/LC_MESSAGES/popt.mo \
	./usr/share/doc/libpopt0/changelog.Debian.gz \
	./usr/share/locale/ru/LC_MESSAGES/popt.mo \
	./usr/share/locale/pl/LC_MESSAGES/popt.mo \
	./lib/arm-linux-gnueabihf/libpopt.so.0 \
	./usr/share/locale/is/LC_MESSAGES/popt.mo \
	./usr/share/locale/nl/LC_MESSAGES/popt.mo \
	./usr/share/locale/es/LC_MESSAGES/popt.mo \
	./usr/share/locale/fr/LC_MESSAGES/popt.mo \
	./usr/share/locale/de/LC_MESSAGES/popt.mo \
	./usr/share/locale/tr/LC_MESSAGES/popt.mo \
	./usr/share/locale/ro/LC_MESSAGES/popt.mo \
	./usr/share/doc/libpopt0/README \
	./usr/share/locale/ko/LC_MESSAGES/popt.mo \
	./usr/share/locale/da/LC_MESSAGES/popt.mo \
	./usr/share/locale/sv/LC_MESSAGES/popt.mo \
	./usr/share/locale/eo/LC_MESSAGES/popt.mo \
	./usr/share/locale/uk/LC_MESSAGES/popt.mo \
	./usr/share/locale/sk/LC_MESSAGES/popt.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/popt.mo \
	./usr/share/locale/ca/LC_MESSAGES/popt.mo \
	./usr/share/locale/hu/LC_MESSAGES/popt.mo \
	./usr/share/locale/wa/LC_MESSAGES/popt.mo \
	./usr/share/locale/id/LC_MESSAGES/popt.mo \
	./usr/share/locale/lv/LC_MESSAGES/popt.mo \
	./usr/share/locale/vi/LC_MESSAGES/popt.mo \
	./usr/share/locale/pt/LC_MESSAGES/popt.mo \
	./usr/share/locale/zh_TW/LC_MESSAGES/popt.mo \
	./lib/arm-linux-gnueabihf/libpopt.so.0.0.0 \
	./usr/share/doc/libpopt0/changelog.gz \
	./usr/share/locale/nb/LC_MESSAGES/popt.mo \
	./usr/share/locale/cs/LC_MESSAGES/popt.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
