PACKAGES = "${PN} libelf1"
PROVIDES = "libelf1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/e/elfutils/libelf1_0.176-1.1+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelf1 = "libelf1_0.176-1.1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1cca0bdc100d162608d34769b41e73bd963abb3c3b3b8587218cd1f707d4bc89"
SRC_URI[deb0.md5sum] = "3d93b64eb9422ee91c14ab1841f3d7e0"

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
