PACKAGES = "${PN} libelf1"
PROVIDES = "libelf1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/elfutils/libelf1_0.176-1.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelf1 = "libelf1_0.176-1.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "013c168e64666e33e431701f7b1d683d2234f39caa2d801e389ef69266e88167"
SRC_URI[deb0.md5sum] = "bca904af6aed1d9b4a8e4cb65969ad3c"

RDEPENDS_libelf1 = "libc6 (>= 2.28) zlib1g (>= 1:1.1.4)"
DEPENDS = "libc6 zlib1g"


inherit deb_group

FILES_libelf1 = " \
    ./usr/lib/arm-linux-gnueabihf/libelf-0.176.so \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.1 \
    ./usr/share/doc/libelf1/changelog.Debian.gz \
    ./usr/share/doc/libelf1/changelog.gz \
    ./usr/share/doc/libelf1/copyright \
    ./usr/share/locale/de/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/en@boldquot/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/en@quot/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/es/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/ja/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/pl/LC_MESSAGES/elfutils.mo \
    ./usr/share/locale/uk/LC_MESSAGES/elfutils.mo\
"
