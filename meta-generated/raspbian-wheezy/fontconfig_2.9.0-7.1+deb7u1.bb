PACKAGES = "fontconfig fontconfig-config libfontconfig1"
PROVIDES = "fontconfig fontconfig-config libfontconfig1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.9.0-7.1+deb7u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.9.0-7.1+deb7u1_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.9.0-7.1+deb7u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.9.0-7.1+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "77a2cdc4a4fd0513bb00248575f2c516ca4a94c076537648c60714d6409eb998"
SRC_URI[deb0.md5sum] = "6e1dbf02095f1e159461d34c7672d9bf"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.9.0-7.1+deb7u1_all.deb"
SRC_URI[deb1.sha256sum] = "d51cee6ee436b133a76596bcda4e296bc8aaec0cb92c4f34190c7452b5c3a7f2"
SRC_URI[deb1.md5sum] = "0b87612bfe39ca0c65d850f4410a312f"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.9.0-7.1+deb7u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "e6e880635ecd14d09ae92e4f932301f18bae28f66526abc22211c6ad991b0517"
SRC_URI[deb2.md5sum] = "9970b485e56188db265e7a3d1fdca5dc"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libfontconfig1 (>= 2.9.0) fontconfig-config"
RDEPENDS_${PN}-config = "debconf (>= 0.5) ucf (>= 0.29) ttf-dejavu-core"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.13-28) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) zlib1g (>= 1:1.1.4) fontconfig-config (= 2.9.0-7.1+deb7u1)"
DEPENDS = "debconf ttf-dejavu-core ucf libfreetype6 zlib1g libc6 libexpat1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/lintian/overrides/fontconfig \
	./usr/share/doc/fontconfig/AUTHORS \
	./usr/bin/fc-pattern \
	./usr/bin/fc-cache \
	./usr/share/man/man1/fc-cat.1.gz \
	./usr/share/doc-base/fontconfig-user \
	./usr/bin/fc-match \
	./usr/share/doc/fontconfig/changelog.gz \
	./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
	./usr/share/man/man1/fc-list.1.gz \
	./usr/bin/fc-scan \
	./usr/bin/fc-list \
	./usr/share/doc/fontconfig/copyright \
	./usr/share/man/man1/fc-cache.1.gz \
	./usr/share/man/man1/fc-pattern.1.gz \
	./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
	./usr/share/doc/fontconfig/README.gz \
	./usr/share/man/man1/fc-query.1.gz \
	./usr/share/doc/fontconfig/changelog.Debian.gz \
	./usr/share/doc/fontconfig/fontconfig-user.html \
	./usr/share/man/man1/fc-scan.1.gz \
	./usr/bin/fc-query \
	./usr/bin/fc-cat \
	./usr/share/doc/fontconfig/README.Debian \
	./usr/share/man/man1/fc-match.1.gz\
"
FILES_fontconfig-config = " \
	./etc/fonts/conf.d/50-user.conf \
	./etc/fonts/conf.avail/30-metric-aliases.conf \
	./etc/fonts/conf.avail/60-latin.conf \
	./etc/fonts/fonts.dtd \
	./etc/fonts/conf.avail/49-sansserif.conf \
	./etc/fonts/conf.d/65-fonts-persian.conf \
	./etc/fonts/conf.d/30-metric-aliases.conf \
	./etc/fonts/conf.avail/10-sub-pixel-bgr.conf \
	./etc/fonts/conf.avail/11-lcdfilter-legacy.conf \
	./etc/fonts/conf.d/README \
	./etc/fonts/conf.avail/10-no-sub-pixel.conf \
	./etc/fonts/conf.avail/65-fonts-persian.conf \
	./etc/fonts/conf.avail/69-unifont.conf \
	./etc/fonts/fonts.conf \
	./etc/fonts/conf.d/51-local.conf \
	./etc/fonts/conf.avail/11-lcdfilter-light.conf \
	./etc/fonts/conf.d/45-latin.conf \
	./etc/fonts/conf.avail/20-unhint-small-vera.conf \
	./etc/fonts/conf.avail/70-yes-bitmaps.conf \
	./usr/share/man/man5/fonts-conf.5.gz \
	./etc/fonts/conf.avail/45-latin.conf \
	./etc/fonts/conf.avail/65-nonlatin.conf \
	./etc/fonts/conf.avail/80-delicious.conf \
	./etc/fonts/conf.d/49-sansserif.conf \
	./etc/fonts/conf.avail/30-urw-aliases.conf \
	./etc/fonts/conf.d/69-unifont.conf \
	./usr/share/doc/fontconfig-config/copyright \
	./etc/fonts/conf.d/20-fix-globaladvance.conf \
	./etc/fonts/conf.d/30-urw-aliases.conf \
	./etc/fonts/conf.avail/20-fix-globaladvance.conf \
	./etc/fonts/conf.avail/70-no-bitmaps.conf \
	./etc/fonts/conf.avail/70-force-bitmaps.conf \
	./etc/fonts/conf.avail/65-khmer.conf \
	./etc/fonts/conf.avail/51-local.conf \
	./usr/share/doc/fontconfig-config/AUTHORS \
	./etc/fonts/conf.avail/11-lcdfilter-default.conf \
	./etc/fonts/conf.d/20-unhint-small-vera.conf \
	./etc/fonts/conf.avail/25-unhint-nonlatin.conf \
	./etc/fonts/conf.avail/40-nonlatin.conf \
	./etc/fonts/conf.avail/50-user.conf \
	./etc/fonts/conf.avail/10-sub-pixel-vrgb.conf \
	./etc/fonts/conf.d/80-delicious.conf \
	./etc/fonts/conf.avail/10-unhinted.conf \
	./etc/fonts/conf.d/90-synthetic.conf \
	./usr/share/doc/fontconfig-config/README.gz \
	./usr/share/doc/fontconfig-config/changelog.gz \
	./etc/fonts/conf.avail/90-synthetic.conf \
	./usr/share/doc/fontconfig-config/changelog.Debian.gz \
	./etc/fonts/conf.avail/10-sub-pixel-rgb.conf \
	./etc/fonts/conf.d/65-nonlatin.conf \
	./etc/fonts/conf.avail/10-autohint.conf \
	./etc/fonts/conf.d/60-latin.conf \
	./etc/fonts/conf.d/40-nonlatin.conf \
	./etc/fonts/conf.avail/10-sub-pixel-vbgr.conf\
"
FILES_libfontconfig1 = " \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1 \
	./usr/share/doc/libfontconfig1/changelog.gz \
	./usr/share/doc/libfontconfig1/AUTHORS \
	./usr/share/doc/libfontconfig1/README.gz \
	./usr/share/doc/libfontconfig1/copyright \
	./usr/share/doc/libfontconfig1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.5.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
