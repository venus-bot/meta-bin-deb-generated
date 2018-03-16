PACKAGES = "${PN} fontconfig fontconfig-config libfontconfig1"
PROVIDES = "fontconfig fontconfig-config libfontconfig1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.11.0-6.3+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.11.0-6.3+deb8u1_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.11.0-6.3+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.11.0-6.3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "a70451ecc3683661b13e41cfca6e427eaf215866002d7ebcaf38a3118a529ab4"
SRC_URI[deb0.md5sum] = "d8d903c78c15dbfff65e7a64c9796bba"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.11.0-6.3+deb8u1_all.deb"
SRC_URI[deb1.sha256sum] = "f7963c0338fd031101f3f684a4e37306eefcd05094220947dd9cb7388a2fe85f"
SRC_URI[deb1.md5sum] = "ec38a9f319d9110d827560f11b14b244"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.11.0-6.3+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "5a0462016b5f48b5c90009b30ecba3ec33ab41481fb2a246995df85ac4d100a9"
SRC_URI[deb2.md5sum] = "4857524dc64b1960047e5cc68d5405f9"

RDEPENDS_${PN} = "libc6 (>= 2.4) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.2.1) fontconfig-config"
RDEPENDS_${PN}-config = "debconf (>= 0.5) ucf (>= 0.29) fonts-dejavu-core"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.7) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) fontconfig-config (>= 2.11.0-6.3+deb8u1)"
DEPENDS = "libexpat1 libc6 libfreetype6 fonts-dejavu-core debconf ucf"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/bin/fc-cache \
    ./usr/bin/fc-cat \
    ./usr/bin/fc-list \
    ./usr/bin/fc-match \
    ./usr/bin/fc-pattern \
    ./usr/bin/fc-query \
    ./usr/bin/fc-scan \
    ./usr/bin/fc-validate \
    ./usr/share/doc-base/fontconfig-user \
    ./usr/share/doc/fontconfig/AUTHORS \
    ./usr/share/doc/fontconfig/README.Debian \
    ./usr/share/doc/fontconfig/README.gz \
    ./usr/share/doc/fontconfig/changelog.Debian.gz \
    ./usr/share/doc/fontconfig/changelog.gz \
    ./usr/share/doc/fontconfig/copyright \
    ./usr/share/doc/fontconfig/fontconfig-user.html \
    ./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
    ./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
    ./usr/share/lintian/overrides/fontconfig \
    ./usr/share/man/man1/fc-cache.1.gz \
    ./usr/share/man/man1/fc-cat.1.gz \
    ./usr/share/man/man1/fc-list.1.gz \
    ./usr/share/man/man1/fc-match.1.gz \
    ./usr/share/man/man1/fc-pattern.1.gz \
    ./usr/share/man/man1/fc-query.1.gz \
    ./usr/share/man/man1/fc-scan.1.gz \
    ./usr/share/man/man1/fc-validate.1.gz\
"
FILES_fontconfig-config = " \
    ./etc/fonts/conf.d/10-scale-bitmap-fonts.conf \
    ./etc/fonts/conf.d/11-lcdfilter-default.conf \
    ./etc/fonts/conf.d/20-unhint-small-vera.conf \
    ./etc/fonts/conf.d/30-metric-aliases.conf \
    ./etc/fonts/conf.d/30-urw-aliases.conf \
    ./etc/fonts/conf.d/40-nonlatin.conf \
    ./etc/fonts/conf.d/45-latin.conf \
    ./etc/fonts/conf.d/49-sansserif.conf \
    ./etc/fonts/conf.d/50-user.conf \
    ./etc/fonts/conf.d/51-local.conf \
    ./etc/fonts/conf.d/60-latin.conf \
    ./etc/fonts/conf.d/65-fonts-persian.conf \
    ./etc/fonts/conf.d/65-nonlatin.conf \
    ./etc/fonts/conf.d/69-unifont.conf \
    ./etc/fonts/conf.d/80-delicious.conf \
    ./etc/fonts/conf.d/90-synthetic.conf \
    ./etc/fonts/conf.d/README \
    ./etc/fonts/fonts.conf \
    ./usr/share/doc/fontconfig-config/AUTHORS \
    ./usr/share/doc/fontconfig-config/README.gz \
    ./usr/share/doc/fontconfig-config/changelog.Debian.gz \
    ./usr/share/doc/fontconfig-config/changelog.gz \
    ./usr/share/doc/fontconfig-config/copyright \
    ./usr/share/fontconfig/conf.avail/10-autohint.conf \
    ./usr/share/fontconfig/conf.avail/10-no-sub-pixel.conf \
    ./usr/share/fontconfig/conf.avail/10-scale-bitmap-fonts.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-bgr.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-rgb.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vbgr.conf \
    ./usr/share/fontconfig/conf.avail/10-sub-pixel-vrgb.conf \
    ./usr/share/fontconfig/conf.avail/10-unhinted.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-default.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-legacy.conf \
    ./usr/share/fontconfig/conf.avail/11-lcdfilter-light.conf \
    ./usr/share/fontconfig/conf.avail/20-unhint-small-vera.conf \
    ./usr/share/fontconfig/conf.avail/25-unhint-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/30-metric-aliases.conf \
    ./usr/share/fontconfig/conf.avail/30-urw-aliases.conf \
    ./usr/share/fontconfig/conf.avail/40-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/45-latin.conf \
    ./usr/share/fontconfig/conf.avail/49-sansserif.conf \
    ./usr/share/fontconfig/conf.avail/50-user.conf \
    ./usr/share/fontconfig/conf.avail/51-local.conf \
    ./usr/share/fontconfig/conf.avail/60-latin.conf \
    ./usr/share/fontconfig/conf.avail/65-fonts-persian.conf \
    ./usr/share/fontconfig/conf.avail/65-khmer.conf \
    ./usr/share/fontconfig/conf.avail/65-nonlatin.conf \
    ./usr/share/fontconfig/conf.avail/69-unifont.conf \
    ./usr/share/fontconfig/conf.avail/70-force-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/70-no-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/70-yes-bitmaps.conf \
    ./usr/share/fontconfig/conf.avail/80-delicious.conf \
    ./usr/share/fontconfig/conf.avail/90-synthetic.conf \
    ./usr/share/man/man5/fonts-conf.5.gz \
    ./usr/share/xml/fontconfig/fonts.dtd\
"
FILES_libfontconfig1 = " \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.8.0 \
    ./usr/share/doc/libfontconfig1/AUTHORS \
    ./usr/share/doc/libfontconfig1/README.gz \
    ./usr/share/doc/libfontconfig1/changelog.Debian.gz \
    ./usr/share/doc/libfontconfig1/changelog.gz \
    ./usr/share/doc/libfontconfig1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
